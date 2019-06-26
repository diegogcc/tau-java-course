package chapter3;

import java.util.Scanner;

/*
IF ELSE
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String args[]){

//        Initialize values we know
        int quota = 10;
//        Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
//        Make a decision on the patch to take - Output
        if (sales >= 10){
            System.out.println("Congratulations! you have surpassed the minimun quota");
        } else {
            int salesShort = quota - sales;
            System.out.println("We are sorry but you were short " + salesShort + " sales this week.");
        }

    }
}
