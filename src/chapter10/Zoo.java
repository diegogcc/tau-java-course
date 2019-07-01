package chapter10;

import chapter9.Cake;

//Demonstrating polymorphism
public class Zoo {

    public static void main(String args[]){
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        //polymorphism
        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();

        /* sasha is of type Animal so it doesn't have access to Cat.scratch().
           To go around it, sasha has to be casted as a Cat.
        */
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat){
            System.out.println("here's your cat food");
        }
    }
}
