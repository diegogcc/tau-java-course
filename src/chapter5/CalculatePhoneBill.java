package chapter5;

/*
PHONE BILL CALCULATOR
Calculate the final total of someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage minutes
Charge the user 0.25 for every minute they were over their plan, and 15% tax ono the subtotal
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill.
 */

import java.util.Scanner;

public class CalculatePhoneBill {
    public static void main(String args[]){
        System.out.println("Enter base cost of the plan: ");
        Scanner scanner = new Scanner(System.in);
        double baseCost = scanner.nextDouble();
        System.out.println("Enter the overage minutes:");
        int overageMinutes = scanner.nextInt();
        scanner.close();

        double overageFee = getOverageFee(overageMinutes);
        double subTotal = baseCost + overageFee;
        double taxFee = getTaxFee(subTotal);
        double total = getTotal(subTotal, taxFee);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + taxFee);
        System.out.println("Total: $" + total);
    }

    private static double getTotal(double subTotal, double taxFee) {
        return subTotal + taxFee;
    }

    private static double getTaxFee(double subtotal) {
        return 0.15 * (subtotal);
    }

    public static double getOverageFee(int minutes){
        double chargeXMinute = 0.25;
        return (double)(chargeXMinute * minutes);
    }
}
