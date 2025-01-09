package day2;

public class Question3 {
    public static void reArrange(int[] arr) {
        int i = 0;
        int j = 0;
        int temp;
        while(i < arr.length) {
            if (arr[i] < 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,1,1,-7,1,-9};
        reArrange(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}