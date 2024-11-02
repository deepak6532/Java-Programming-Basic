import java.util.*;

class swap
{
public static void main(String args[])
{
int a,b,c;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the value of a and b ");
a = sc.nextInt();
b = sc.nextInt();

System.out.println("Before swapping "+"\n "+"A = " + a + "\n "+"B = " + b);

// a = a + b;
// b = a-b;
// a = a-b;

/*Swap of two value using third variable*/
c = a;
   a = b;
   b = c;

System.out.println("After swapping "+"\n "+"A = " + a + "\n "+"B = " + b);

}
}