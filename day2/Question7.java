package day2;

import java.util.HashSet;
import java.util.Set;

public class Question7 {
    public static String palindromes(String s, int val) {
        int i;
        int j;
        int largest = -1;
        String largestPalindrome = "";

        for (int k = 0; k < s.length(); k++) {
            Set<Character> characters = new HashSet<>();
            i = k;
            j = k;
            while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
                characters.add(s.charAt(i));

                if (characters.size() == 2) {
                    return s.substring(i, j + 1);
                }

                String str = s.substring(i, j + 1);

                if (str.length() > largest) {
                    largest = str.length();
                    largestPalindrome = str;
                }

                i--;
                j++;
            }
        }

        for (int k = 0; k < s.length(); k++) {
            Set<Character> characters = new HashSet<>();
            i = k;
            j = k + 1;
            while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
                characters.add(s.charAt(i));

                if (characters.size() == 2) {
                    return s.substring(i, j + 1);
                }

                String str = s.substring(i, j + 1);

                if (str.length() > largest) {
                    largest = str.length();
                    largestPalindrome = str;
                }

                i--;
                j++;
            }
        }
        return largestPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(palindromes("xaaaaax", 2));
    }
}
