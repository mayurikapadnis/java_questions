import java.util.Scanner;

public class microProject2 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int myNumber = (int) (Math.random()*100);
        int userNumber=0;

        do{
            System.out.println("Guess my Number: ");
            userNumber= sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WOOHHHHH... You Guess Right Number !!!");
                break;
            }

            else if(userNumber > myNumber){
                System.out.println("Your NUmbe rid large !!!");
            }

            else {
                System.out.println("Your Number is Small !!!");
            }
        }while(userNumber >= 0);

        System.out.println("My number was: +myNumber");
    }
}
