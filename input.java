import java.util.*;

class input{

    public static void main(String[] args)
    {
        int number ;

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the value of number ");
        number  = sc.nextInt();

        if(number%2==0)
        {
            System.out.println("Even number "+ number);
        }
        else
        {
            System.out.println("Odd number " + number);
        }
    }
}