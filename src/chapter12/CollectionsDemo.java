package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String args[]){
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //4
        System.out.println(fruit);

        //while loop with iterator
        Iterator i = fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //enhanced for loop
        for(String item:fruit){
            System.out.println(item);
        }

        //for each method with a lambda expression
        fruit.forEach(x -> System.out.println(x));
        fruit.forEach(System.out::println);
    }

    public static void listDemo(){
        List<String> fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); // banana
        System.out.println(fruit.size()); // 5
        System.out.println(fruit);

        //while loop with iterator
        Iterator i = fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //enhanced for loop
        for(String item:fruit){
            System.out.println(item);
        }

        //for each method with a lambda expression
        fruit.forEach(x -> System.out.println(x));
        fruit.forEach(System.out::println);
    }

    public static void queueDemo(){
        Queue<String> fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); // 5
        System.out.println(fruit);

        //while loop with iterator
        Iterator i = fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //enhanced for loop
        for(String item:fruit){
            System.out.println(item);
        }

        //for each method with a lambda expression
        fruit.forEach(x -> System.out.println(x));
        fruit.forEach(System.out::println);
    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size()); // 4
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);

        //enhanced for loop
        for(Map.Entry<String, Integer> entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        //foreach method with a lambda parameter
        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}
