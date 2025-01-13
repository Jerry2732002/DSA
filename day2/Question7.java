package day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question7 {
    public static String largest(String s, int val) {
        int i = 0;
        int j = 0;
        int largest = -1;
        String result = "";
        Set<Character> chars = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!chars.contains(s.charAt(j))) {
                chars.add(s.charAt(j));
                j++;
            } else {
                if (largest < (j - i)) {
                    largest = j - i;
                    result = s.substring(i,j);
                    if (largest == val) {
                        return result;
                    }
                }
                while (chars.contains(s.charAt(j))) {
                    chars.remove(s.charAt(i));
                    i++;
                }
            }
        }
        if (largest < (j - i)) {
            largest = j - i;
            result = s.substring(i,j);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(largest("abcdadeghjk", 3));
    }
}
