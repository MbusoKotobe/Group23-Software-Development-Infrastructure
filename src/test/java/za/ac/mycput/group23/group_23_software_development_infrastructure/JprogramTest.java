/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.group23.group_23_software_development_infrastructure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;



/**
 *
 * @author Juan-Lee Klink 218236883
 * testing the code to make a human
 */

public class JprogramTest {
    
    public JprogramTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void testEquality(){
        Jprogram human2 = new Jprogram ("John","Male","Pizza","DBZ");
        Jprogram human3 = new Jprogram ("Dwayne","Male","Pizza","Naruto");
        
        assertEquals(human2.getHumanFavouritefood(),human3.getHumanFavouritefood());
    
    }
    
    @Test
    public void testIdentity(){
         Jprogram human4 = new Jprogram ("John","Male","Pizza","DBZ");
         Jprogram human5 = new Jprogram ("John","Male","Mussels","Naruto");
         
         assertSame(human4.getHumanName(),human5.getHumanName());
    }
    
    @Test
    public void testFail(){
        Jprogram human6 = new Jprogram ("Brent","Male","Pizza","DBZ");
        Jprogram human7 = new Jprogram ("Keelan","Male","Mussels","Naruto");
         
        assertSame(human6.getHumanName(),human7.getHumanName());
    }
    
    
    @Test
    @Disabled
    public void disabletest(){
        Jprogram human6 = new Jprogram ("Brent","Male","Pizza","DBZ");
        Jprogram human7 = new Jprogram ("Keelan","Male","Mussels","Naruto");
         
        assertSame(human6.getHumanName(),human7.getHumanName()); 
    }
    
    
    
    
    
    
   
    
        
    
    
   
    
}
