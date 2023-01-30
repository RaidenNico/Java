package pkgfinal;

import java.sql.*;

/**
 *
 * @author Your Name <Nizzho>
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( Connection conn = ConnDB1.getCnx()) {
            String sql = "Select id,nombre from usuario";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println(id + " - " + nombre);
            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
