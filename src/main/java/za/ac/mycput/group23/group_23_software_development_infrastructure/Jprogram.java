/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.group23.group_23_software_development_infrastructure;

/**
 *
 * @author Juan-Lee Klink
 * code to make a human 
 */
public class Jprogram {
    
    private String humanName;
    private String humanGender;
    private String humanFavouritefood;
    private String humanFavouriteanime;
    
    public Jprogram(){
        System.out.println("In Jprogram constructor");
    }
    
    public Jprogram(String hName,String hGender,String hFavfood,String hFavanime){
        this.humanName = hName;
        this.humanGender = hGender;
        this.humanFavouritefood = hFavfood;
        this.humanFavouriteanime = hFavanime;
    }
    
    
}
