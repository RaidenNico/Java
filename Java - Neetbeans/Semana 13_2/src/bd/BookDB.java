package bd;

import entity.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class BookDB {
    
    public ArrayList<Book> getBooks(int authorId){
        ArrayList<Book> books = new ArrayList<Book>();
        try(Connection conn = ConnDB.getCnx()){
            CallableStatement sp = conn.prepareCall(" call get_books ( ? )");
            sp.setInt(1, authorId);
            ResultSet rs = sp.executeQuery();
            while(rs.next()){
                int bookId = rs.getInt("book_id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                java.util.Date published = 
                        new java.util.Date(rs.getDate("published").getTime());
                Author author = new Author(rs.getInt("author_id"), 
                        rs.getString("author_name"), rs.getString("author_email"));
                double price = rs.getDouble("price");
                int rating = rs.getInt("rating");
                
                Book book = new Book(bookId, title, description, published, 
                        author, price, rating);
                books.add(book);
            }
            sp.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return books;
    }
    
}
