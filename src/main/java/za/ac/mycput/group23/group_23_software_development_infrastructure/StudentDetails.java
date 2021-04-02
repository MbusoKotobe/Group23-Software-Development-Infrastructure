package za.ac.mycput.group23.group_23_software_development_infrastructure;

/**
 * 
 *
 */
public class StudentDetails 
{
     String Name;
    String Surname;
    
    
    public StudentDetails(String Name, String Surname){
         this.Name = Name;
         this.Surname = Surname;
         }
    
    public String getName(){
        return Name;
    }
    
    public String getSurname(){
        return Surname;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setSurname(String Surname){
        this.Surname = Surname;
    }
    
    public void displayStudentDetails(){
     System.out.println("I am "+getName()+"my surname is"+getSurname());
    }
   

    
    public static void main( String[] args )
    {
        
    }
}
