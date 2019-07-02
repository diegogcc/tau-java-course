package chapter11;

public abstract class Shape {

    abstract double calculateArea();

    //Abstract classes can have implemented methods too.
    public void print(){
        System.out.println("I am a shape");
    }
}
