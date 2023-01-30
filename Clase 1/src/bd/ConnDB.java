package bd;

import java.sql.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ConnDB {
    
    static String url = "jdbc:mysql://localhost:3306/daa1_s2";
    static String username = "root";
    static String password = "root";
    
    public static Connection getCnx() throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }
    
}
