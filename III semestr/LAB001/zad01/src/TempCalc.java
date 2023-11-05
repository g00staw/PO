import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempCalc extends JFrame {

    private JPanel Panel1;
    private JTextField textField1;
    private JButton button1;
    private JButton clearButton;
    private JButton button2;
    private JLabel Wynik;
    private JLabel stopnie;
    private JLabel format;

    private int mode=0;
    private double givenTemp=0;
    public TempCalc(){
        super("Kalkulator temperatury");
        this.setContentPane(this.Panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double score=0;
                givenTemp = Double.parseDouble(textField1.getText());
                if(mode%2==0){
                    stopnie.setText("℃");
                    format.setText("Format:  ℃ → ℉");
                    score = (givenTemp*9/5)+32;
                    Wynik.setText(score + " ℉");
                }else {
                    score = (givenTemp-32)*5/9;
                    Wynik.setText(score + " ℃");
                }

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode+=1;
                if(mode%2==0) {
                    stopnie.setText("℃");
                    format.setText("Format:  ℃ → ℉");
                }else{
                    stopnie.setText("℉");
                    format.setText("Format:  ℉ → ℃");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                Wynik.setText("");
            }
        });
    }

    public static void main(String[] args) {
        TempCalc calculator = new TempCalc();
        calculator.setVisible(true);
    }
}
