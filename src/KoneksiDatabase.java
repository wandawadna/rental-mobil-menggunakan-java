import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class KoneksiDatabase {
    private static Connection koneksi;    
    public static Connection getKoneksi()
    {
    // cek apakah koneksi null
        if (koneksi == null)
        {
            try {
                String url = "jdbc:mysql://localhost/rental_mobil";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Error Membuat Koneksi");
            }
        }
        return koneksi; 
    }
    
}