
/**
 * @author Dylan Layden
 * 
 */
public class Nicknames
{
    /*
     * Instance variables are your adjectives that describe your object. These are always private.
     */
    private String first;
    private String middle;
    private String last;
    
    /**
     * No args constructor for the Time class 
     */
    public Nicknames()
    {
        first = "Chicken";
    }
    
    /**
     * Constructor will take three parameter variables
     * @param first the first name
     * @param middle the middle name
     * @param last the last name
     */
    public Nicknames(String f, String m, String l)
    {
        first = f;
        middle = m;
        last = l;
        
        if (f.equals("Chicken")){
            m = "Dunker";
            l = "Wilker";
        }
        
    }
    
    /**
     * Mutator method change
     * @param f
     */
    public void setFirst(String f)
    {
        first = f;
    }
    
    /**
     * Mutator method change
     * @param f
     */
    public void setMiddle(String m)
    {
        middle = m;
    }
    
    /**
     * Mutator method change
     * @param f
     */
    public void setLast(String l)
    {
        last = l;
    }
    
     public String toString()
    {
       return first + " " + middle + " " + last;
    }
    
    public boolean equals(Time t)
    {
        if (first == t.first && middle == t.middle && last == t.last)
            return true;
        return false;
    }
    
    
}
