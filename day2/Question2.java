package day2;

public class Question2 {
    public static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int item : arr) {
            min = Math.min(min, item);
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(findMinimum(new int[]{1,2,3,4,5,-6,-7}));
    }
}
