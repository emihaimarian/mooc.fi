/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emiha
 */
public class Book {
    
    private String title;
    private int numberOfPages;
    private int publicationYear;
    
    public Book(String title, int numberOfPages, int publicationYear){
    
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    
    public int getPublicationYear(){
        return this.publicationYear;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.numberOfPages + " pages" + ", " + this.publicationYear;
    }
}