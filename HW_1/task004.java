import java.util.ArrayList;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class task004 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 1, 2, 3, 3, 2, 1, 2, 3};
        //int[] arr2 = {0, 1, 2, 3, 3, 2, 1, 2};
        //int[] arr2 = {};
        System.out.println(divideArray(arr1, arr2));
    }

    public static ArrayList<Float> divideArray(int[] arr1, int[] arr2) {
        ArrayList<Float> res = new ArrayList<>();


        if (arr1.length < 1 || arr2.length < 1) {
            throw new RuntimeException("Один из массивов пуст");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина  массивов разная!");
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            } else {
                res.add((float) (arr1[i] / arr2[i]));
            }
        }
        return res;
    }
}
