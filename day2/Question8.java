package day2;

import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public static int fruitPick(String[] arr) {
        int result = 0;
        int i = 0;
        int j = 0;
        Map<String, Integer> fruit = new HashMap<>();

        while (i < arr.length && j < arr.length) {
            if (fruit.containsKey(arr[j])) {
                fruit.put(arr[j], fruit.get(arr[j]) + 1);
            } else {
                fruit.put(arr[j], 1);
            }
            if (fruit.size() > 2) {
                result = Math.max(result, (fruit.get(arr[i]) + fruit.get(arr[j - 1])));
                fruit.remove(arr[i]);
                i = j - 1;
            }
            j++;
        }
        if (result == 0) {
            return j;
        }
        else {
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(fruitPick(new String[]{"3","3","3","1","2","1","1","2","3","4"}));
    }
}
