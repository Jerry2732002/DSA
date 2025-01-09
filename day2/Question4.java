package day2;

public class Question4 {

    public static void rotateArray(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 1, 1, -7, 1, -9};
        rotateArray(arr);
        rotateArray(arr);
        rotateArray(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
