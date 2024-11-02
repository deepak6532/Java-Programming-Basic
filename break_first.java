import java.util.*;

class break_first
{
    public static void main(String args[])
    {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        n = sc.nextInt();

        for(int i =1;i<=n;i++)
        {
            System.out.println(i);
            if(i==7)
            {
                break;
            }
            
        }


    }
}