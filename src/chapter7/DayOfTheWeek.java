package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String DAYS_OF_WEEK[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
    "Sunday"};

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int day;
        do {
            System.out.println("Enter the number of a day of the week: ");
            day = scanner.nextInt();
        } while ( day <= 0 || day > DAYS_OF_WEEK.length);

        System.out.println(DAYS_OF_WEEK[day - 1]);
    }

}
