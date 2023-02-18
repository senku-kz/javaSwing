package form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLogin extends JDialog {

    private JTextField textFieldLogin;
    private JPanel panelLogin;
    private JPasswordField passwordField;
    private JLabel labelLogin;
    private JLabel labelPassword;
    private JButton buttonLogin;
    private JButton buttonConfig;
    private JLabel labelErrorMessage;

    public FrmLogin(JFrame parent){
        super(parent);
        this.setTitle("Login form");
        this.setContentPane(panelLogin);
        this.setMinimumSize(new Dimension(300, 200));
        this.setModal(true);
        this.setLocationRelativeTo(parent);
        this.labelErrorMessage.setText("");
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });
        buttonConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configure();
            }
        });
        this.setVisible(true);
    }

    private void configure() {
    }

    private void loginUser() {
        String login = textFieldLogin.getText();
        String password = passwordField.getText();

        if(login.isEmpty() || password.isEmpty()){
            labelErrorMessage.setText("Please enter all fields and try again");
            return;
        }

        boolean isActive = checkUser(login, password);
    }

    private boolean checkUser(String login, String password) {
        final String dbUrl = "";
        final String dbUsername = "";
        final String dbPassword = "";

        return false;
    }

}
