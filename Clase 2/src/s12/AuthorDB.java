package s12;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class AuthorDB {
    
    //CRUD
    public ArrayList<Author> getAuthors(String name){
        
        ArrayList<Author> authors = new ArrayList<Author>();
        
        try (  Connection conn = ConnDB.getCnx();
                CallableStatement statement = conn.prepareCall("{ call get_authors(?) }"); ) 
         {
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Author author = new Author();
                author.setAuthorId(resultSet.getInt("author_id"));
                author.setName(resultSet.getString("name"));
                author.setEmail(resultSet.getString("email"));
                authors.add(author);
            }
           
            statement.close();
            conn.close();
        } catch (SQLException e) {
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
