/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s12;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos Camayo
 */
public class AuthorCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AuthorDB db = new AuthorDB();
        
        ArrayList<Author> authors = db.getAuthors("");
        
        for (Author author : authors) {
            System.out.println(author.toString());
        }
        
        System.out.println("Insert:");
        db.createAuthor("Juan Perez", "jperez@mail.com");
        
        System.out.println("Update:");
        db.updateAuthor(14, "Josach Bloch", "bloch@mail.com");
                
        System.out.println("Delete:");
        db.deleteAuthor(12);
        
        authors = db.getAuthors("");
        for (Author author : authors) {
            System.out.println(author.toString());
        }
        
    }
    
}
