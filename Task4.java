public class Task4 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива, и возвращающий новый массив,
    // каждый элемент которого равен частному элементов двух входящих массивов в той
    // же ячейке. Если длины массивов не равны,
    // необходимо как-то оповестить пользователя.
    // Важно: При выполнении метода единственное исключение, которое пользователь
    // может увидеть - RuntimeException, т.е. ваше.
    public static void main(String[] args) {
        int[] firstArr = { 2, 4, 5 };
        int[] secondArr = { 2, 9, 0 };
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
            if (secondArr[i] == 0) {
                throw new ArithmeticException("Деление на ноль не возможно");
            }
            newArray[i] = firstArr[i] / secondArr[i];
        }

        return newArray;

    }
}
