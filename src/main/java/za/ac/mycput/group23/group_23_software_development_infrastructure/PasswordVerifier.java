package za.ac.mycput.group23.group_23_software_development_infrastructure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mbuso Kotobe 218040385
 * This program validates if a password 
 * is strong and safe to use.
 */
public class PasswordVerifier 
{   

    private String password;

    public PasswordVerifier()
    {
        this.password = "";
    }

    public PasswordVerifier(String password)
    {
        this.password = password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return this.password;
    }

    public boolean isPasswordLong(String password)
    {
        if(password.length() >= 8) return true;
        else return false;
    }

    public boolean isPasswordStrong(String password)
    {
        String specialCharacters = "[^A-Za-z0-9]";
        Pattern pattern = Pattern.compile(specialCharacters);
        Matcher matcher = pattern.matcher(password);
        return (matcher.find());
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}