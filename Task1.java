
public class Task1 {
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static void main(String[] args) {
        div(10, 0);
        int[] arr = new int[5];
        fillArray(arr);
        findIndexOf(10, null);

    }

    public static int div(int num1, int num2) {
        return num1 / num2;

    }

    public static void fillArray(int[] array) {
        for (int index = 0; index <= array.length; index++) {
            array[index] = (int) Math.random() * 11;
        }

    }

    public static int findIndexOf(int value, int[] nums) {

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == value) {
                return index;
            }
        }

        return -2;

    }

}