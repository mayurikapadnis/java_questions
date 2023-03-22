import java.util.Scanner;
public class addtionOfInteger {
    public static void main(String[] args)
    {
        int rem=0, sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        for(int i=0; i<=n+1; i++)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Addtion of number: "+sum);
    }
}
