import java.util.*;

import javax.lang.model.util.ElementScanner14;;

public class Stack {

    final static int max = 5;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int top=-1,ch;
        int STACK[]= new int[max];

        do
        {
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.println("Enter you choice");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    if(top==max)
                    {
                        System.out.println("STACK OVERFLOW!!!");
                    }
                    else 
                    {
                        System.out.println("Enter Element To Insert in Stack");
                        int ele = sc.nextInt(); 
                        top++;
                        STACK[top] = ele;
                    }
                    break;
                
                case 2:
                    if(top == -1)
                    {
                        System.out.println("STACK UNDERFLOW");
                    }
                    else 
                    {
                        top--;
                    }
                    break;

                case 3:
                    for(int i=top; i>-1; i--)
                    {
                        System.out.println("||"+STACK[i]+"||");
                    }
                    break;
                case 4:
                    break;
            }
        }while(ch !=4);
    }
}
