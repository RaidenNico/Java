package s12;

import java.sql.*;
/**
 *
 * @author Juan Carlos Camayo
 */
public class ReadCallAuthor {
    
    public static void main(String[] args) {
        try(Connection conn = ConnDB.getCnx()){
            
            CallableStatement sp = conn.prepareCall(" call get_author() ");
            
            boolean hadResults = sp.execute();
            
            System.out.println("|  Id   |  Nombre   |   Email    |");
            System.out.println("==================================");
        
            while (hadResults) {
                ResultSet rs = sp.getResultSet();
                while(rs.next()){
                    int author_id = rs.getInt("author_id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    System.out.println("| " + author_id + " | " + name + " | " + email + "|");
                }
                hadResults = sp.getMoreResults();
            }
            
            sp.close();
            conn.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
