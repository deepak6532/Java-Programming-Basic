import java.util.*;

class area_all
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);

System.out.println("Enter the length and width " );
int l = sc.nextInt();
int b  = sc.nextInt();

int area = l*b;
System.out.println("Area of rectangle is " + area );


System.out.println("Enter radius of circle ");
int r = sc.nextInt();



double areac = 3.14*r*r;
System.out.println( "Area of circle is " + areac);

}
}