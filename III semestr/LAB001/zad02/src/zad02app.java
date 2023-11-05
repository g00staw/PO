import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zad02app extends JFrame {
    private JPanel panel1;
    private JTextField topicTextField;
    private JTextArea trescTextArea;
    private JTextField deadLineTextField;
    private JRadioButton niskiRadioButton;
    private JRadioButton sredniRadioButton;
    private JRadioButton wysokiRadioButton;
    private JButton addNoteButton;
    private JTable table1;
    private JButton removeButton;
    private JButton editButton;
    private String priority;

    DefaultTableModel tableModel;
    TaskManager taskManager = new TaskManager();

    public zad02app() {
        super("To-do app");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(niskiRadioButton);
        buttonGroup.add(sredniRadioButton);
        buttonGroup.add(wysokiRadioButton);

        tableModel = new DefaultTableModel(new Object[]{"Nagłówek", "Treść", "Priorytet", "Termin wykonania", "Powtarzanie"}, 0);
        table1.setModel(tableModel);

        addNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (niskiRadioButton.isSelected()) {
                    priority = "Niski";
                } else if (sredniRadioButton.isSelected()) {
                    priority = "Średni";
                } else if (wysokiRadioButton.isSelected()) {
                    priority = "Wysoki";
                }

                Task task = new Task(topicTextField.getText(), trescTextArea.getText(), priority, deadLineTextField.getText());
                tableModel.addRow(new Object[]{task.getTopic(), task.getContents(), task.getPriority(), task.getDeadLine()});

                taskManager.addTask(topicTextField.getText(), trescTextArea.getText(), priority, deadLineTextField.getText());

                topicTextField.setText("");
                trescTextArea.setText("");
                deadLineTextField.setText("");
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String topicToRemove = JOptionPane.showInputDialog(null, "Podaj nazwę notatki do usunięcia:", "Usuń notatkę", JOptionPane.PLAIN_MESSAGE);

                // Sprawdź, czy nazwa notatki nie jest pusta
                if (topicToRemove != null && !topicToRemove.isEmpty()) {
                    // Usuń notatkę o podanej nazwie z listy
                    taskManager.removeTask(topicToRemove);

                    // Zaktualizuj tabelę
                    updateTable();
                }
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table1.getSelectedRow();
                if (selectedRow >= 0) {
                    // Pobierz wybrany wiersz i dane
                    String content = table1.getValueAt(selectedRow, 1).toString();
                    String title = table1.getValueAt(selectedRow, 0).toString();

                    // Otwórz okno dialogowe do edycji zawartości
                    String newContents = JOptionPane.showInputDialog(null, "Edytuj zawartość notatki:", "Edytuj notatkę", JOptionPane.PLAIN_MESSAGE, null, null, content).toString();

                    // Zaktualizuj zawartość notatki w taskManager
                    taskManager.editContents(title, newContents);

                    // Zaktualizuj tabelę
                    updateTable();
                }
            }
        });

        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table1.rowAtPoint(evt.getPoint());
                int column = table1.columnAtPoint(evt.getPoint());
                if (row >= 0 && column == 1) {
                    String content = table1.getValueAt(row, column).toString();
                    String title = table1.getValueAt(row, 0).toString();
                    JOptionPane.showMessageDialog(null, content, title, JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        this.pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            zad02app todoapp = new zad02app();
            todoapp.setVisible(true);
        });
    }
    private void updateTable() {
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }

        for (Task task : taskManager.getTaskList()) {
            tableModel.addRow(new Object[]{task.getTopic(), task.getContents(), task.getPriority(), task.getDeadLine()});
        }
    }
}