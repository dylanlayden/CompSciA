
import java.util.Scanner;
public class ClassworkPractice3
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    double a;
    double b;
    double c;
    double d;
    System.out.println("Are you a member of FES");
    String answer1 = scan.nextLine();
    if (answer1.equalsIgnoreCase("yes"))
       {a = 5;
        }
    else
        a = 1;
    
    System.out.println("Would you eat alien heads homemade shwarma?");
    String answer2 = scan.nextLine();
    if (answer2.equalsIgnoreCase("yes"))
       {b = 5;
        }
    else
        b = 1;
        
    System.out.println("When listening to sicko mode how gangster do you feel on a scale of 1 to 10?");
    int answer3 = scan.nextInt();
    if (answer3 > 8)
       {c = 5;
        }
    else
        c = 1;
        
    System.out.println("Complete the sentence: Steven hessle wears ____ pants");
    String answer4 = scan.next();
    if (answer4.equalsIgnoreCase("yoga"))
       {d = 5;
        }
    else
        d = 1;
    double shnaeLevel; 
    shnaeLevel = (a + b + c + d);
    
    if (shnaeLevel > 15)
    {
        System.out.println("You have earned shween status");
    }
       else
       System.out.println("You are no shnae just a regular chicken");
       
        
    }
}
