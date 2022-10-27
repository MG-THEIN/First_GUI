import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JLabel success;
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JPanel panel;
    private static JFrame frame;

    public static void main(String[] args) {
        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);

        success = new JLabel("");
        success.setBounds(10,150,600,25);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);

        button = new JButton("Login");
        button.setBounds(90,100, 80,25);
        button.addActionListener(new Main());


        panel = new JPanel();
        panel.setLayout(null);
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(button);
        panel.add(success);

        frame = new JFrame();
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("Alex") && password.equals("1234")){
            success.setText("You have successfully login!");
        } else{
            success.setText("Login fail! Please check your user name and password");
        }
    }
}