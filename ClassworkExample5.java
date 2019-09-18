
import java.util.Scanner;
public class ClassworkExample5
{
 public static void main(String[] args)
 {
     Scanner scan = new Scanner(System.in);
     boolean gameMode = true;
     while (gameMode == true)
     {
         System.out.println("Ask me a question:");
         System.out.println("To quit enter \"quit\"");
         String answer = scan.nextLine();
         double randNum = (int)(Math.random()*3);
         if (randNum == 0)
            System.out.println("Greg says only the shnae knows that");
         else if (randNum == 1)
            System.out.println("Greg says the odds are in your favor");
         else if (answer.equals("quit"))
            gameMode = false;
         
         else
            System.out.println("Greg says the odds are against you");
     }

 }
}