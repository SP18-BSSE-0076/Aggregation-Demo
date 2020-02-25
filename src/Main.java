import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        SecondClass s1 = new SecondClass();      //creating object
        SecondClass s2 = new SecondClass();      //creating object
        SecondClass s3 = new SecondClass(); 
        s1.setLastName("Atif1");          //setting value using (settor method in 2nd class)
        s2.setLastName("Atif2");          //setting value using (settor method in 2nd class)
        s3.setLastName("Atif3");          //setting value using (settor method in 2nd class)

        ArrayList <SecondClass> al = new ArrayList<SecondClass>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
//creating object
        FirstClass f = new FirstClass(al);       //creating object
        
        //System.out.println(f.getList());  
        System.out.println(f.getData(2));  
        
        //calling to print details
        //System.out.println(al.get(0).lastName);
       // f.setFirstName("Muhammad");     
        //f.startName();                         
    }
}