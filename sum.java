import java.util.*;


class sum{

    public static int add(int a ,int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Enter the value of number1 and number2 :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Sum of two number is :" + add(num1,num2));

    }
}
