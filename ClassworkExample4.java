    
import java.util.Scanner;
public class ClassworkExample4
{
    public static void main(String[] args) //method header
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("What is your name:");
     String userEntry = scan.nextLine();
     System.out.println("Hello " + userEntry);
     if (userEntry.equals("Steven") || userEntry.equals("steven"))
        System.out.println("Great name");
     else if (userEntry.equals("chicken") || userEntry.equals("Chicken"))
        System.out.println("Say hi to Greg");
     else 
        System.out.println("Your no shnae");
     
    }
}
