package chapter4;
/*
DO WHILE LOOP
Write a program that allows a user to enter two numbers,
and then sums up the two numbers. The user should be able to
repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        boolean again = false;
        do {
            System.out.println("Enter the first number");
            double first = scanner.nextDouble();
            System.out.println("Enter the second number");
            double second = scanner.nextDouble();

            double sum = first + second;

            System.out.println("The sum is: " + sum);
            System.out.println("Would you like to start again? ");
            again = scanner.nextBoolean();

        } while (again);
        scanner.close();
    }
}
