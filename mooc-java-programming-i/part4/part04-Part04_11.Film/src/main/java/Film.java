/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emiha
 */
public class Film {
    
    private int filmAgeRating;
    private String filmName;
    
    public Film(String filmName, int filmAgeRating){
    
        this.filmAgeRating = filmAgeRating;
        this.filmName = filmName;
    }
    
    public String name(){
        return this.filmName;
    }
    
    public int ageRating(){
        return this.filmAgeRating;
    }
}
