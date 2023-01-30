package pkgfinal;

import java.sql.*;
import java.util.*;


public class UsuarioTinkaDB {

    public ArrayList<UsuarioTinka> getUsuarios() {
        ArrayList<UsuarioTinka> Usuariotin = new ArrayList<UsuarioTinka>();
        try ( Connection conn = ConnDB1.getCnx())
        {
            CallableStatement statement = conn.prepareCall("{ call ObtenerUsuario() }"); 
            
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                UsuarioTinka usuario = new UsuarioTinka();
                usuario.setId(resultSet.getInt("id"));
                usuario.setNombres(resultSet.getString("Nombres"));
                usuario.setCorreo(resultSet.getString("Correo"));
                usuario.setPuntos(resultSet.getInt("Puntos"));
                Usuariotin.add(usuario);
            }
        
        
        
        

           statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return Usuariotin;
    }

    public boolean updateUsuario(int id, String Nombres, String Correo, int Puntos) {
        boolean exito = false;
        try ( Connection conn = ConnDB1.getCnx();  CallableStatement sp = conn.prepareCall(" CALL UpdateUsuario(?,?,?,?) ");) {
            sp.setInt(1, id);
            sp.setString(2, Nombres);
            sp.setString(3, Correo);
            sp.setInt(4, Puntos);
            sp.execute();
            exito = true;
            sp.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return exito;
    }

    public boolean InsertarUsuario(int idtinka, String Nombres, String Correo, int Puntos) {
        boolean exito = false;
        try ( Connection conn = ConnDB1.getCnx();  CallableStatement sp = conn.prepareCall(" CALL InsertarUsuario(?,?,?,?) ");) {

            sp.setInt(1, idtinka);
            sp.setString(2, Nombres);
            sp.setString(3, Correo);
            sp.setInt(4, Puntos);
            sp.execute();
            exito = true;
            sp.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return exito;
    }

    public boolean EliminarUsuario(int id) {
        boolean exito = false;
        try ( Connection conn = ConnDB1.getCnx();  CallableStatement sp = conn.prepareCall(" CALL EliminarUsuario(?) ");) {
            sp.setInt(1, id);
            sp.execute();
            exito = true;
            sp.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return exito;
    }
}
