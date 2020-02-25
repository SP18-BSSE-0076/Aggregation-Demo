import java.util.ArrayList;

public class FirstClass
{
    String firstName;                   //field
    
    private ArrayList<SecondClass> s;              // 2nd class object declare in 1st class
    
    public FirstClass(ArrayList<SecondClass> s)    // 2nd class object initialize in 1st class constructor.
    {
        this.s = s;
    }    
                    //Creating gettor settor of the field

    public String getFirstName()
    {
        return this.firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public ArrayList<SecondClass> getList()       //Creating a method in which we print 2nd class field using 2nd class object
    {
        return s;
    }

    public SecondClass getData(int i)       //Creating a method in which we print 2nd class field using 2nd class object
    {
        if (i < s.size())
            return s.get(i);
        else
            {
            System.out.println("index out of range");
            return null;
            }
    }

//    public void startName()     //Creating a method in which we print first name of first class
//    {
//        System.out.println(firstName);
//    }
}