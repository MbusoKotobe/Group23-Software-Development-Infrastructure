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
    
    public void setHumanName (String hName){
        this.humanName = hName;
    }
    
    public String getHumanName(){
        return this.humanName;
    }
    
    public void setHumanGender (String hGender){
        this.humanGender = hGender;
    }
    
    public String getHumanGender(){
        return this.humanGender;
    }
    
    public void setHumanFavouritefood (String hFavfood){
        this.humanFavouritefood = hFavfood;
    }
    
    public String getHumanFavouritefood(){
        return this.humanFavouritefood;
    }
    
    public void setHumanFavouriteanime (String hFavanime){
        this.humanFavouriteanime = hFavanime;
    }
    
    public String getHumanFavouriteanime(){
        return this.humanFavouriteanime;
    }
    
    @Override
    public String toString(){
        String HumanString = "Human's Name: " + this.humanName + "\n" + "Human's Gender: " + this.humanGender + "\n" + "Human's favourite food:" + this.humanFavouritefood + "\n" + "Human's favourite anime:" + this.humanFavouriteanime;
        return HumanString;
    }
}
