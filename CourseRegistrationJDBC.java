import java.sql.*;
import java.util.Scanner;

public class CourseRegistrationJDBC {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "password")) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Course Code: ");
            String code = sc.nextLine();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM CourseRegistration WHERE CourseCode=?");
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();

            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.println(rs.getString("StudentName") + " | " + rs.getString("CourseName"));
            }
            if (!found) System.out.println("No students registered for this course.");