
package pkgfinal;

import java.sql.*;

public class ConnDB1 {
 static private String Url = "jdbc:mysql://localhost:3306/daa1_s1";
 static private String username= "root";
 static private String password = "141071";
 
 public static Connection getCnx() throws SQLException{
 return DriverManager.getConnection(Url,username,password);
 
 }
}
