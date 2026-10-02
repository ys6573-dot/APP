import java.sql.*;

public class ProductJDBC {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "password")) {
            // Insert
            PreparedStatement ps = con.prepareStatement("INSERT INTO Product VALUES(?,?,?,?)");
            ps.setInt(1, 201);
            ps.setString(2, "Laptop");
            ps.setDouble(3, 60000);
            ps.setInt(4, 5);
            ps.executeUpdate();

            // Retrieve
            ps = con.prepareStatement("SELECT * FROM Product WHERE ProductID=?");
            ps.setInt(1, 201);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) System.out.println(rs.getString("ProductName"));

            // Update quantity
            ps = con.prepareStatement("UPDATE Product SET Quantity=? WHERE ProductID=?");
            ps.setInt(1, 15);
            ps.setInt(2, 201);
            ps.executeUpdate();

            // Display low stock
            rs = con.createStatement().executeQuery("SELECT * FROM Product WHERE Quantity<10");
            while (rs.next()) System.out.println(rs.getString("ProductName"));
        } catch (Exception e) { e.printStackTrace(); }
    }
}
