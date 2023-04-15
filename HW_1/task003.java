// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.ArrayList;

public class task003 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {0, 1, 2, 3, 3, 2, 1, 2, 3};
        //int[] arr2 = {0, 1, 2, 3, 3, 2, 1, 2};
        //int[] arr2 = {};
        System.out.println(differenceArray(arr1,arr2));
    }

public static ArrayList<Integer> differenceArray(int[] arr1, int[] arr2) {
            ArrayList<Integer> res = new ArrayList<>();

            if (arr1.length < 1 || arr2.length < 1) {
                throw new RuntimeException("Один из массивов пуст");
            }
            if (arr1.length != arr2.length) {
                throw new RuntimeException("Длина  массивов разная!");
            }
            for (int i = 0; i < arr1.length; i++) {
                res.add(arr1[i] - arr2[i]);
            }
            return res;
        }
}
