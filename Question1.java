import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Question1 {
    public static int solution(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        long start = System.currentTimeMillis();
        int count = 0;
        for(int i : arr) {
            if (!set.contains(k - i)) {
                set.add(i);
            } else {
                set.remove(k - i);
                count++;
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            arr[i] = i + 1;
        }
        System.out.println(solution(arr, 5000000));
    }
}
