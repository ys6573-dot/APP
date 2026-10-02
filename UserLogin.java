import javax.swing.*;

public class UserLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Login");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 100, 30);
        JTextField userField = new JTextField();
        userField.setBounds(120, 20, 200, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 100, 30);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(120, 60, 200, 30);

        JCheckBox rememberMe = new JCheckBox("Remember Me");
        rememberMe.setBounds(120, 100, 150, 30);
        JCheckBox notifications = new JCheckBox("Receive Notifications");
        notifications.setBounds(120, 130, 200, 30);

        JButton login = new JButton("Login");
        login.setBounds(120, 170, 100, 30);
        login.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                "Login successful for " + userField.getText() +
                "\nRemember Me: " + rememberMe.isSelected() +
                "\nNotifications: " + notifications.isSelected());
        });

        frame.add(userLabel); frame.add(userField);
        frame.add(passLabel); frame.add(passField);
        frame.add(rememberMe); frame.add(notifications);
        frame.add(login);

        frame.setVisible(true);
    }
}
