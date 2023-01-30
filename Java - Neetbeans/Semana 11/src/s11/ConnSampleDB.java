package s11;

import java.sql.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ConnSampleDB {

        static private String url = "jdbc:mysql://localhost:3306/DAA1_S1";
        static private String username = "root";
        static private String password = "root";
    
        public static Connection getCnx() throws SQLException{
            return DriverManager.getConnection(url, username, password);
        }
        
}
