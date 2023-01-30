package s12;

import java.sql.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class CreateSP {
    
    public static void main(String[] args) {
        try(Connection conn = ConnDB.getCnx()){
            Statement st = conn.createStatement();
            String queryDrop = "DROP PROCEDURE IF EXISTS delete_book";
            String queryCreate = "";
            queryCreate += "CREATE PROCEDURE delete_book(IN bookId int)";
            queryCreate += "    BEGIN ";
            queryCreate += "        DELETE FROM book WHERE book_id = bookId; ";
            queryCreate += "    END ";
            
            st.execute(queryDrop);
            st.execute(queryCreate);
            
            st.close();
            conn.close();
            
            System.out.println("Store Procedure created succedfully!");
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
