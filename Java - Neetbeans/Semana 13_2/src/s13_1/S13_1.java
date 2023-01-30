package s13_1;


import bd.*;
import entity.*;
import java.util.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class S13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AuthorDB db = new AuthorDB();
        ArrayList<Author> lista = db.getAuthors();
        
        for (Author author : lista) {
            System.out.println(author.getAuthorId() + "\t" + author.getName() + 
                        "\t" + author.getEmail());
            for (Book book : author.getBooks()) {
                System.out.println("\t" + book.getBookId() + "\t" + book.getTitle() 
                            + book.getPublished());
            }
        }
        
        System.out.println("=================================================");
        
        BookDB dbBook = new BookDB();
        ArrayList<Book> books = dbBook.getBooks(0);
        for (Book book : books) {
            System.out.println("" + book.getBookId() + "\t" + book.getTitle() + "\t"
                + book.getPrice() + "\t" + book.getAuthor().getName());
        }
        
        
    }
    
}
