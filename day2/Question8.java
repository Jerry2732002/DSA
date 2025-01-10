package day2;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public static int fruitPick(String[] arr) {
        int result = 0;
        Map<String, Integer> fruit = new HashMap<>();
        for (String str : arr) {
            if (fruit.containsKey(str)) {
                fruit.put(str, fruit.get(str) + 1);
            } else {
                fruit.put(str, 1);
            }
        }
        Map.Entry<String, Integer> entry = fruit.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .findFirst()
                .get();

        result += entry.getValue();

        entry = fruit.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .skip(1)
                .findFirst()
                .get();
        result += entry.getValue();


        return result;
    }

    public static void main(String[] args) {
        System.out.println(fruitPick(new String[]{"A","B","A","B","A","B"}));
    }
}
