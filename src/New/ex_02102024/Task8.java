package New.ex_02102024;

import java.util.Scanner;

public class Task8
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int a = sc.nextInt();
        System.out.println("Enter the Second value :");
        int b = sc.nextInt();
        System.out.println("Enter the operator:");
        char op = sc.next().charAt(0);


        switch (op) {
        case '+' :
            System.out.println("calculate the addition " + (a+b));
            break;
        case '-':
            System.out.println("calculate the sub " + (a-b));
            break;
        case '*':
            System.out.println("calculate the multiplication " + (a*b));
            break;
        case '/' :
            System.out.println("calculate the division " + (a/b));
            break;
        case '%' :
            System.out.println("calculate the modules " + (a%b));
            break;

        default:
            System.out.println("Invalid Input");



            }

    }
    }

