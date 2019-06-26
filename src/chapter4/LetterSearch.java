package chapter4;

import java.util.Scanner;

/*
LOOP BREAK:
Search a String to determine if it contains the letter 'A'
 */
public class LetterSearch {
    public static void main (String args[]){

//        Get Text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

//        Search text for letter A
        boolean found = false;
        for (int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("The text contains the letter A");
        } else {
            System.out.println("The text does not contain the letter A");
        }
    }
}
