package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main (String args[]) throws Exception{
//        createNewFile();
//        createNewFileRethrow();
//        numbersExceptionHandling();
        divideByZero();
    }

    public static void divideByZero(){
        try {
            int c = 30 / 0;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Division is fun");
        }
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws Exception{
        File file = new File("resources/nonexistent.txt");
            file.createNewFile();
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()){
                double num = scanner.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }  catch (Exception e){    // superclass Exception can be caught but needs to be at the end of the catch block
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
