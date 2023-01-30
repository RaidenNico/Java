package s12;

import java.sql.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class TestConnectSP {
    
    public static void main(String[] args) {
        int authorId = 10;
        
        try(Connection conn = ConnDB.getCnx()){
            CallableStatement sp = conn.prepareCall(" call count_books(?,?) ");
            sp.setInt("authorId", authorId);
            sp.registerOutParameter("nBooks", Types.INTEGER);
            sp.execute();
            int cantidad = sp.getInt("nBooks");
            System.out.println("count_books = " + cantidad);
            sp.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
    
}
