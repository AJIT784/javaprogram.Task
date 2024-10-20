package New.ex_02102024;

import java.util.Scanner;

public class Task9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the every month name of the year");
        int month = sc.nextInt();

        switch (month) {
            case 1 -> System.out.println("month is - January");
            case 2 -> System.out.println("month is - February");
            case 3 -> System.out.println("month is - March");
            case 4 -> System.out.println("month is - April");
            case 5 -> System.out.println("month is - May");
            case 6 -> System.out.println("month is - June");
            case 7 -> System.out.println("month is - July");
            case 8 -> System.out.println("month is - August");
            case 9 -> System.out.println("month is - September");
            case 10 -> System.out.println("month is - October");
            case 11 -> System.out.println("month is - November");
            case 12 -> System.out.println("month is - December");
            default -> System.out.println(" Enter the number between 1-12 to get the month name.");

        }
    }
}
