package s11;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class InsertSampleDB {
    
    public static void main(String[] args) {
        
        try(Connection conn = ConnSampleDB.getCnx()){
            String sql = "insert usuario(id, nombre) values (?, ?);";
            
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, 2);
            st.setString(2, "Jose Lopez");
            
            int rowsI = st.executeUpdate();
            if( rowsI > 0){
                System.out.println("Nuevo usuario registrado");
            }
            
            st.close();
            conn.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
                
                
    }
}
