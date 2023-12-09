package koneksi.java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Sidiq
 */
public class conection {
    
    private static Connection connection;

    public static Connection getConnection() {
        if(connection == null){
            try{
                String url = "jdbc:mysql://localhost:3306/rental_mobil?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String user ="root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connection=DriverManager.getConnection(url, user, password);
            }catch(SQLException t){
                System.out.println("Error membuat koneksi");
            }
        }
        return connection;
    }
}
