package chapter6;

public class PhoneBillCalculator {

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill(12341243);
        bill.setUsedMinutes(1000);
        bill.printItemizedBill();
    }
}
