package chapter3;

import java.util.Scanner;

public class ChangeGame {
    public static void main (String args[]){
        double penny = 1;
        double nickle = 5;
        double dime = 10;
        double quarter = 25;

        System.out.println("Enter the number of pennies: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();
        System.out.println("Enter the number of nickles: " );
        int numberOfNickles = scanner.nextInt();
        System.out.println("Enter the number of Dimes: ");
        int numberOfDimes = scanner.nextInt();
        System.out.println("Enter the number of Quarters: ");
        int numberOfQuarters = scanner.nextInt();
        scanner.close();

        double penniesTotal = penny * numberOfPennies;
        double nicklesTotal = nickle * numberOfNickles;
        double dimesTotal = dime * numberOfDimes;
        double quarterTotal = quarter * numberOfQuarters;
        double total = penniesTotal + nicklesTotal + dimesTotal + quarterTotal;

        String message;
        if (total < 100){
            double missing = (100.0 - total)/100;
            message = "You are " + missing + " short";
        } else if (total > 1){
            double over = (total - 100.0)/100;
            message = "You are " + over + " over";
        } else {
            message = "You win!";
        }

        System.out.println(message);
    }
}
