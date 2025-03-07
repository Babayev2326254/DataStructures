package postgresconn;

import java.sql.*;

public class PostgresConnectionExample {
    public static void main(String[] args) {
        // PostgreSQL verilənlər bazası bağlantı detalları
        String url = "jdbc:postgresql://localhost:5432/postgres"; // DB-nin URL-si
        String user = "postgres"; // PostgreSQL istifadəçi adı
        String password = "2326254"; // PostgreSQL şifrəsi

        // Bağlantı obyektini elan edirik
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // PostgreSQL driver-i yükləyirik
            Class.forName("org.postgresql.Driver");

            // Verilənlər bazasına qoşuluruq
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Verilənlər bazasına uğurla qoşuldu!");

            // SQL sorğusu icra edirik
            stmt = conn.createStatement();
            String query = "SELECT * FROM babeyev"; // Mövcud cədvəldən məlumat çəkirik
            rs = stmt.executeQuery(query);

            // Nəticələri ekrana çıxarırıq
            while (rs.next()) {
                int id = rs.getInt("id");
                String userName = rs.getString("userName");
                String country = rs.getString("country");

                System.out.println("ID: " + id + ", UserName: " + userName + ", Country: " + country);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Resursları bağlayırıq
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
