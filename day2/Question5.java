package day2;

public class Question5 {

    public static String reverseString(String s) {
        String[] words = s.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i >= 1; i--) {
            reverse.append(words[i]).append(" ");
        }
        reverse.append(words[0]);
        return reverse.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("I am Joel."));
    }
}
