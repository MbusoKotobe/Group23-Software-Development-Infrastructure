/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.ac.cput.sumikaklaasen;

/**
 *
 * @author Lenovo
 */
public class GetGrade {
    public String print(int grade)
    {
        if(grade >95)
            return "Your grade is A";
        else if(grade>85)
            return "Your grade is B";
        else if (grade>75)
            return "Your grade is C";
        else
            return "You have to study bro";
        
    }
}
