package za.ac.mycput.group23.group_23_software_development_infrastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mbuso Kotobe 218040385
 * This program validates if a password 
 * is strong and safe to use.
 */
public class PasswordVerifierTest 
{
    
    PasswordVerifier obj = new PasswordVerifier("123456");
    PasswordVerifier obj2 = new PasswordVerifier("123456");
    String password;
    String unfitPassword;
    String nearlyFit;
    String almostFit;
    
    @BeforeEach
    public void setUp()
    {
        password = "C++11isAwesome";
        unfitPassword = "123456789";
        nearlyFit = "C12345";
        almostFit = "C1a234f5";
        obj2 = obj;
    }

    //Tests if two objects are equal
    @Test
    public void testObjectEquality()
    {
        assertEquals(obj, obj2);
    }

    @Test
    public void testObjectIdentity()
    {
        assertSame(obj, obj2);
    }
   
    //Failing Test
    @Test
    public void isPasswordStrongTest()
    {
        //Test with valid password
        boolean result = false;
        result = obj.isPasswordStrong(password);
        assertEquals(true, result);

        //Test with unfit password
        boolean resultTwo = false;
        resultTwo = obj.isPasswordStrong(unfitPassword);
        assertEquals(false, resultTwo);

        //Test with nearlyFit Password
        boolean resultThree = false;
        resultThree = obj.isPasswordStrong(nearlyFit);
        assertEquals(false, resultTwo);

        //Test with almost fit password, THIS FAILS.
        boolean resultFour = false;
        resultFour = obj.isPasswordStrong(almostFit);
        assertEquals(true, resultFour);
    }

    //Timeout Test
    @Test
    @Timeout(5)
    public void timeoutTest() throws InterruptedException
    {
        Thread.sleep(4000);
    }

    //Disabled Test
    @Test
    @Disabled
    public void isPasswordStrongDisabledTest()
    {
        boolean result = false;
        result = obj.isPasswordStrong(password);
        assertEquals(true, result);
    }
}