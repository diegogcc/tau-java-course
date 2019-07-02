package chapter11;

public class Farm {

    public static void main(String args[]){
        Animal morgan = new Pig();
        morgan.makeSound();

        Pig dominic =  new Pig();
        dominic.makeSound();

        Duck natalia = new Duck();
        natalia.makeSound();
    }
}
