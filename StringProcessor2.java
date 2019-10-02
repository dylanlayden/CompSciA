

public class StringProcessor2
{
    public static String withoutEnds(String str)
    {
        return str.substring(1,str.length() -1); 
        
    }
      public static String front2(String str)
    {
     return str.substring(str.length() -2,str.length()) + str.substring(0,str.length() -2); 
        
    }
    public static String firstFour(String str)
    {
     if (str.length() < 4) 
     {
         int i =str.length();
         while (i <4)
         {
             str= str + "#";
             i++;
             
            }
         
         return (str);
     }
     else
        return str.substring(0,4);
         
    }
}
