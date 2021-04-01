/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.ac.cput.sumikaklaasen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class GetGradeTest {

    private static int timeout;

    private static void assertSame(String wrong_message_displayed, String result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assertEquals(String wrong_message_displayed, String your_grade_is_A, String result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public GetGradeTest() {
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
   // public static void assertEquals(){
        
 public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        GetGrade ab = new GetGrade();
       String result = ab.print(97);
       assertEquals("Wrong message displayed", "Your grade is A", result);
    
    }
    @Test
   public static void assertSame(){
      GetGrade ab = new GetGrade();
        String result = ab.print(97);
      assertSame("not the same", result);
       
}
   @Test
   public static void FailTest(Object grade){
        GetGrade ab = new GetGrade();
        String result = ab.print(0);
        //Object grade;
        if (null == grade){
            fail("should not be null");
        }

}
            }
        }
   }
