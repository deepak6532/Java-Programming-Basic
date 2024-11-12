import java.util.*;

class takec
{
public static void main(String args[])
{
String ch;
System.out.println("Enter a character : ");

Scanner sc = new Scanner(System.in);

ch = sc.next().charAt();      // input single character 


//ch = sc.nextLine();      // input string value 
System.out.println(ch);
}
}