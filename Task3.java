public class Task3 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива,
    // и возвращающий новый массив, каждый элемент которого равен разности элементов
    // двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static void main(String[] args) {
        int[] firstArr = new int[5];
        int[] secondArr = new int[6];
        newArray(firstArr, secondArr);
    }

    public static int[] newArray(int[] firstArr, int[] secondArr) {
        if (firstArr == null && secondArr == null) {
            throw new NullPointerException("Массив null");
        }
        if (firstArr.length != secondArr.length) {

            throw new RuntimeException("Массивы должны быть одинаковой длины");
        }

        int[] newArray = new int[secondArr.length];

        for (int i = 0; i < secondArr.length; i++) {
            newArray[i] = firstArr[i] - secondArr[i];
        }

        return newArray;

    }
}
