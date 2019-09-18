  
import java.util.Scanner;
public class ClassworkPractice4
{
    public static void main(String[] args) //method header
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter your username");
     String userEntry = scan.nextLine();
     if (userEntry.equals("Steven"))
        System.out.println("Enter your password");
        String userPassword = scan.nextLine();
        if (userPassword.equals("Fletch123"))
        System.out.println("You have been accepted");

     else 
        System.out.println("Your no shnae");
     
    }
}
