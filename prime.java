import java.util.Scanner;
public class prime {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();
        for(int i=2; i<n; i++)
        {
            if(n % i == 0)
            {
                System.out.println("not");
                break;
            }
            else
            {
                System.out.println("yes");
                break;
            }
        }
    }
}