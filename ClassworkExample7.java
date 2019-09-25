

public class ClassworkExample7
{
  public static void main(String[] args)
   {
       System.out.println(findSum(2,3));
       System.out.println(canIVote(17));
    }
    
  public static double findSum(int a, int b)
  {
   return a+b;   
   }
   
  public static String canIVote(int age)
   {
       if (age >17) 
        return "You can vote";
       else 
        return "You can't vote";
    }
}
