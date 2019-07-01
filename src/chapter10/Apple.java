package chapter10;

public class Apple extends Fruit {

    public Apple(){
        setCalories(180);
    }

    public void removeSeeds(){
        System.out.println("Seeds have been removed from your Apple");
    }

    @Override
    public void makeJuice(){
        System.out.println("Here's your apple juice");
    }
}
