
public class  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Course Management");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String[] courses = {"Java", "Python", "C++", "Data Structures"};
        JList<String> courseList = new JList<>(courses);
        JScrollPane courseScroll = new JScrollPane(courseList);
        courseScroll.setBounds(20, 20, 150, 200);

        String[] columns = {"Student Name", "Course", "Status"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(200, 20, 350, 200);

        JTextField studentField = new JTextField();
        studentField.setBounds(20, 240, 150, 30);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(200, 240, 100, 30);
        addBtn.addActionListener(e -> {
            String student = studentField.getText();
            String course = courseList.getSelectedValue();
            if (student != null && course != null) {
                model.addRow(new Object[]{student, course, "Enrolled"});
            }
        });

        JButton removeBtn = new JButton("Remove");
        removeBtn.setBounds(320, 240, 100, 30);
        removeBtn.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) model.removeRow(selectedRow);
        });

        frame.add(courseScroll);
        frame.add(tableScroll);
        frame.add(studentField);
        frame.add(addBtn);
        frame.add(removeBtn);

        frame.setVisible(true);
    }
}
