package Jan13;

import java.sql.*;

public class DatabaseDemo {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/Demo";
        String username = "root";
        String password = "root";

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM People";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                int slno = rs.getInt(1);
                String fn = rs.getString("Name");
                System.out.println(slno + " - " + fn);
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
