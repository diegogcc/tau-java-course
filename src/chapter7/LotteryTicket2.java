package chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket2 {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String args[]){

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

            //Number is unique if we get here. Add it to the array
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static void printTicket(int ticket[]){
        for (int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

    /**
     * Does a sequential search on the array to fin a value
     * @param array Array to osearch through
     * @param number Value to search  for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int number){
        /*This is called  an enhanced loop. Iterate through array and each time
        assigns the current element to 'value'
        */
        for (int value : array){
            if( value == number){
                return true;
            }
        }
        /*
        If we reach this point, then the entire array was searched
        and the value wasn't found
         */
        return false;
    }

    public static boolean binarySearch(int[] array, int number){
        //Array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, number);
        return index >= 0;
    }
}
