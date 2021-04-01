/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.square;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Isaac kissimba
 */
public class CountingRoomsTest {
     public CountingRooms Flow;
     public CountingRooms local;
    
    
    @BeforeEach
    public void setUp() {
        Flow = new CountingRooms();
        local = new CountingRooms();
        Flow = local;
        
    }
     @Test
    public void testIdentity(){
        assertSam(Flow, local);
    }
        @Test
    public void testEquality(){
        assertEquals(Flow, local);
    
    }
   
    @Test
    public void testGetflow() {
        System.out.println("getflow");
       
        String expResult = "5";
        local.setlocal("5");
        String result = local.getlocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setflow method, of class CountingRooms.
     
     */
    @Test
    public void testSetflow() {
        System.out.println("setflow");
        String flow = "";
        CountingRooms instance = new CountingRooms();
        instance.setflow(flow);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getlocal method, of class CountingRooms.
     */
    @Test
    public void testGetlocal() {
        System.out.println("getlocal");
      
        String expResult = "5";
       local.setlocal("5");
       String result = local.getlocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The local number is incorect.");
    }

    /**
     * Test of setlocal method, of class CountingRooms.
    
    */
     @Disabled
    @Test
   
    public void testSetlocal() {
        System.out.println("setlocal");
        String local = "";
        CountingRooms instance = new CountingRooms();
        instance.setlocal(local);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class CountingRooms.
     */
    @Disabled
    @Test
    
    public void testToString() {
        System.out.println("toString");
        CountingRooms instance = new CountingRooms();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    private void assertSam(CountingRooms Flow, CountingRooms local) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
