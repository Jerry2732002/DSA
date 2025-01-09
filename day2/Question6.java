package day2;

public class Question6 {

    public static void palindromes(String s) {
        int i;
        int j;
        for (int k = 0; k < s.length(); k++) {
            i = k;
            j = k;
            while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
                if ((j - i) != 0) {
                    System.out.println(s.substring(i, j + 1));
                }
                i--;
                j++;
            }
        }

        for (int k = 0; k < s.length(); k++) {
            i = k;
            j = k + 1;
            while (i >= 0 && j < s.length()) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.substring(i, j + 1));
                }
                i--;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        palindromes("abbba");
    }
}