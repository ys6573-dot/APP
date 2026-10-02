import java.sql.*;

public class LibraryJDBC {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "password")) {
            // Insert
            PreparedStatement ps = con.prepareStatement("INSERT INTO Book VALUES(?,?,?,?,?)");
            ps.setInt(1, 101);
            ps.setString(2, "Clean Code");
            ps.setString(3, "Robert Martin");
            ps.setDouble(4, 500);
            ps.setBoolean(5, true);
            ps.executeUpdate();

            // Search
            ps = con.prepareStatement("SELECT * FROM Book WHERE BookID=?");
            ps.setInt(1, 101);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) System.out.println(rs.getString("Title"));

            // Display all
            rs = con.createStatement().executeQuery("SELECT * FROM Book WHERE Availability=true");
            while (rs.next()) System.out.println(rs.getString("Title"));

            // Update availability
            ps = con.prepareStatement("UPDATE Book SET Availability=? WHERE BookID=?");
            ps.setBoolean(1, false);
            ps.setInt(2, 101);
            ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
