package day2;

import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public static int fruitPick(String[] arr) {
        Map<String, Integer> fruit = new HashMap<>();
        for (String str : arr) {
            if (fruit.containsKey(str)) {
                fruit.put(str, fruit.get(str) + 1);
            } else {
                fruit.put(str,0);
            }
        }

    }

    public static void main(String[] args) {

    }
}
