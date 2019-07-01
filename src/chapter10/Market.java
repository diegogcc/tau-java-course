package chapter10;

public class Market {
    public static void main(String args[]){
        Apple apple = new Apple();
        apple.makeJuice();
        apple.removeSeeds();

        Fruit fruit = new Apple();
        fruit.makeJuice();

        ((Apple) fruit).removeSeeds();

        fruit = new Banana();
        fruit.makeJuice();

        ((Banana) fruit).peel();

        fruit = new Apple();
        fruit.makeJuice();


    }

}
