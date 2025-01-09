package day2;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static int[] findSum(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr) {
            if (set.contains(n - i)) {
                return new int[]{i, n - i};
            } else {
                set.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] result = findSum(new int[]{1,2,3,4,5,6,7,8}, 7);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
