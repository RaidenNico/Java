package s11;

import java.sql.*;
/**
 *
 * @author Juan Carlos Camayo
 */
public class SelectSampleDB {
    
    public static void main(String[] args) {
    
        try(Connection conn = ConnSampleDB.getCnx()){
            String sql = "select id, nombre from usuario";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println(id + " - " + nombre);
            }
            
            rs.close();
            st.close();
            conn.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
    
}
