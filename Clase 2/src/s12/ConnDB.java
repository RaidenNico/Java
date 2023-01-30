package s12;

import java.sql.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ConnDB {
    
    static String url = "jdbc:mysql://localhost:3306/daa1_s1";
    static String username = "root";
    static String passowrd = "root";
    
    public static Connection getCnx() throws SQLException{
        return DriverManager.getConnection(url, username, passowrd);
    }
    
}
