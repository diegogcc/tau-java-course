package chapter6;

import sun.misc.PostVMInitHook;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        usedMinutes = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        usedMinutes = 800;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes(){
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes = usedMinutes;
    }

    public double calculateOverage(){
        if (usedMinutes <= allottedMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = usedMinutes - allottedMinutes;
        return overageRate * overageMinutes;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f",calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}
