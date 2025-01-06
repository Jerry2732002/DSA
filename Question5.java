public class Question5 {
    public static boolean jumper(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0 && i != arr.length - 1) {
                return false;
            }

            i = i + arr[i];

            if (i == arr.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println(jumper(arr));
    }
}
