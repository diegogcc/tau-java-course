package chapter8;

public class TextProcessor {
    public static void main(String args[]){

        coutWords("I love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeDiego");
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    private static void addSpaces(String text) {
        StringBuilder modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++){
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }

    /**
     * Print a string in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println("");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void coutWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words: ", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
}
