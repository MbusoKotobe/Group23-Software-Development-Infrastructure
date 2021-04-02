/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.group23.group_23_software_development_infrastructure;

import java.time.Duration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ayanda Phumzile Khoza
 * Student number 218057172
 * 
 */
public class GenderTest {
    
    private Gender male;
    private Gender female;
    @Test
    public void objectEquality()
    {
        assertNotSame(male, female);
    }
    
    @Test
    public void objectIdentity()
    {
        assertNotSame(male, female);
    }
    
    @Test
    public void timeoutFail()
    {
        // aborts the excution of the while loop after 5 seconds
        
       fail("Failing test");
        System.out.println("Fail");
        
   }
    
    @Test
    public void disablingText(){
        
        System.setProperty("male ","female");
       // Assumptions.("male".equals(System.getProperty("female")));
  
    }
    
    
    
    
}
