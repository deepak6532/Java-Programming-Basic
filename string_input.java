import java.util.*;

class string_input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        
        String  fname,lname;

        System.out.println("Enter your first name ");
        fname  = sc.nextLine();

        System.out.println("Enter your last  name ");
        lname = sc.nextLine();

        System.out.println("your name is " + fname + " "+ lname);
    }

}