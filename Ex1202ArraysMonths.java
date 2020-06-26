package be.vdab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1202ArraysMonths {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Give number month");
        int numberMonth = scan.nextInt();

        try {
            System.out.println("Month number: " + numberMonth);
            System.out.println("Name month: " + months[numberMonth-1]);
            System.out.println("Amount of days in month: " + dom[numberMonth-1]);
        }
        catch (ArrayIndexOutOfBoundsException e1)   {
            System.out.println("Wrong number");
        }
        catch (InputMismatchException e2)   {
            System.out.println("Wrong input, should be an integer");
            System.exit(1);
        }
    }
}
