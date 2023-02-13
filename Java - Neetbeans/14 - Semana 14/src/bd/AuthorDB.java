package bd;

import java.sql.*;
import java.util.*;
import entity.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class AuthorDB {
    
    public ArrayList<Author> getAuthors(){
        ArrayList<Author> authors = new ArrayList<Author>();
        try(Connection conn = ConnDB.getCnx()){
            CallableStatement sp = conn.prepareCall(" call get_author ()");
            ResultSet rs = sp.executeQuery();
            while(rs.next()){
                int authorId = rs.getInt("author_id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Author author = new Author(authorId, name, email);
                author.setBooks((new BookDB()).getBooks(authorId));
                authors.add(author);
            }
            sp.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return authors;
    }
    
    public boolean updateAuthor(int authorId, String name, String email)
    {
        boolean exito = false;
        try (Connection conn = ConnDB.getCnx();
            CallableStatement sp = conn.prepareCall(" CALL update_author(?,?,?) ");) {
            sp.setInt(1, authorId);
            sp.setString(2, name);
            sp.setString(3, email);
            sp.execute();
            exito = true;
            sp.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return exito;
    }
    
    public boolean createAuthor(String name, String email)
    {
        boolean exito = false;
        try (Connection conn = ConnDB.getCnx();
            CallableStatement sp = conn.prepareCall(" CALL create_author(?,?) ");) {
            sp.setString(1, name);
            sp.setString(2, email);
            sp.execute();
            exito = true;
            sp.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return exito;
    }
    
    public boolean deleteAuthor(int authorId)
    {
        boolean exito = false;
        try (Connection conn = ConnDB.getCnx();
            CallableStatement sp = conn.prepareCall(" CALL delete_author(?) ");) {
            sp.setInt(1, authorId);
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
