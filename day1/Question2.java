package day1;

public class Question2 {
    public static int solution(int[] arr) {
        int i = 0;
        int j = 0;

        while(j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9, 9};
        int result = solution(arr);
        for (int i = 0; i < result; i++) {
            System.out.println(arr[i]);
        }
    }
}
