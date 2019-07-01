package chapter10;

public class Banana extends Fruit {

    public Banana(){
        setCalories(200);
    }

    public void peel(){
        System.out.println("Your banana has been peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Here's your banana juice");
    }
}
