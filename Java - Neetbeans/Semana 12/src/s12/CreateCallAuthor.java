package s12;

import java.sql.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class CreateCallAuthor {
    
    public static void main(String[] args) {
        try(Connection conn = ConnDB.getCnx()){
            
            CallableStatement sp = conn.prepareCall(" call create_author(?, ?) ");
            sp.setString(1, "Juan Perez");
            sp.setString(2, "jperez@mail.com");
            sp.execute();
            
            System.out.println("Registro realizado");
            sp.close();
            conn.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
