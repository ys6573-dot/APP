import javax.swing.*;

public class StudentRegistration {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(120, 20, 200, 30);

        JLabel regLabel = new JLabel("Register No:");
        regLabel.setBounds(20, 60, 100, 30);
        JTextField regField = new JTextField();
        regField.setBounds(120, 60, 200, 30);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(120, 100, 80, 30);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(200, 100, 100, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(20, 140, 100, 30);
        String[] departments = {"CSE", "IT", "ECE", "EEE"};
        JComboBox<String> deptBox = new JComboBox<>(departments);
        deptBox.setBounds(120, 140, 200, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(120, 180, 100, 30);
        submit.addActionListener(e -> {
            String gender = male.isSelected() ? "Male" : "Female";
            JOptionPane.showMessageDialog(frame,
                "Name: " + nameField.getText() + "\nRegister No: " + regField.getText() +
                "\nGender: " + gender + "\nDepartment: " + deptBox.getSelectedItem());
        });

        frame.add(nameLabel); frame.add(nameField);
        frame.add(regLabel); frame.add(regField);
        frame.add(male); frame.add(female);
        frame.add(deptLabel); frame.add(deptBox);
        frame.add(submit);

        frame.setVisible(true);
    }
}
