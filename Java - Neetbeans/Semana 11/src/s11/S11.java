package s11;

import java.sql.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class S11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //probar el driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        }catch(Exception ex){
            System.out.println("Error, no se ha podido cargar MySQL JDBC Driver");
        }
        
        //Probar conexion
        String url = "jdbc:mysql://localhost:3306/DAA1_S1";
        String username = "root";
        String password = "root";
        
        try{
            Connection cnx = DriverManager.getConnection(url, username, password);
            if(cnx!=null){
                System.out.println("Conectados");
                cnx.close();
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
