package chapter12;

import java.util.*;

public class GradeBook {
    public static void main(String args[]){

        Map<String, Integer> exam1 = TestResults.getOriginalGrades();
        Map<String, Integer> exam2 = TestResults.getMakeUpGrades();

        Map finalGrade = new HashMap();

        for(Map.Entry<String, Integer> entry : exam1.entrySet()){
            if (entry.getValue() > exam2.get(entry.getKey())){
                finalGrade.put(entry.getKey(), entry.getValue());
            } else {
                finalGrade.put(entry.getKey(), exam2.get(entry.getKey()));
            }
        }

        System.out.println(finalGrade);


    }
}
