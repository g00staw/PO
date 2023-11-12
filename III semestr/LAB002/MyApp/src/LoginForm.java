import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel loginPanel;
    private JTextField JTextEmail;
    private JPasswordField passwordField1;
    private JButton okButton;
    private JButton cancelButton;

    private String user ="admin", password ="admin";

    public LoginForm(){
        super("Login to app...");
        this.setContentPane(this.loginPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        int width = 500, height=300;
        setSize(500,300);
        this.setMinimumSize(new Dimension(width,height));


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userLogin = JTextEmail.getText();
                String userPassword = new String(passwordField1.getPassword());

                if(userLogin.equals(user) && userPassword.equals(password)){
                } else{
                    JTextEmail.setText("");
                    passwordField1.setText("");
                }
            }
        });

    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
