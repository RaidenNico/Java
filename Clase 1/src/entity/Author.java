package entity;

import java.util.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Author {
    
    private int authorId;
    private String name;
    private String email;
    private ArrayList<Book> books;

    public Author() {
    }

    public Author(int authorId, String name, String email) {
        this.authorId = authorId;
        this.name = name;
        this.email = email;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    /**
     * @return the authorId
     */
    public int getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId the authorId to set
     */
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + getAuthorId() + " | " + 
                "Name: " + getName() + " | " + 
                "Email: " + getEmail();
    }
    
}
