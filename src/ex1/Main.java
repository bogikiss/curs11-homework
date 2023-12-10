package ex1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Valerie", 7);
        students.put("Marco", 6);
        students.put("Eric", 10);
        students.put("Lydia", 9);
        students.put("Emma", 8);
        students.put("Brian", 4);
        System.out.println(students);

        Set<Map.Entry<String, Integer>> studentGrades = students.entrySet();
        for (Map.Entry<String, Integer> studentName : studentGrades) {
            System.out.println(studentName.getKey() + " got " + studentName.getValue());
        }

        int maxValue = Collections.max(students.values());
        for (Map.Entry<String, Integer> entry :
                students.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.println("The student with the highest grade (" + maxValue + "): " + entry.getKey());
            }
        }
    }
}
