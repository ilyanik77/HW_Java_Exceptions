// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class task001 {


    public static void main(String[] args) {
        String[] Array = {"first str", null, "third str"};
        //int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        //System.out.println(division( 2, 0));
        //System.out.println(valueByIndex(array,12));
        printStringArray(Array);
    }

    public static double division(double num1, double num2){
        double res = 0;
        if(num2 ==  0) {
            throw new ArithmeticException("На ноль делить нельзя!!!");
        } else {
            res = num1 / num2;
        }
        return res;
    }



    public static int valueByIndex(int[] array, int index){
        int res1 = 0;
        if(index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Элемента не существует");
        } else {
            res1 = array[index];
        }
        return res1;
    }


        public static void printStringArray(String[] Array){
            for (String item: Array){
                if(item == null) throw new NullPointerException("Элемент отсутствует!!!");
                System.out.println(item);
            }
        }


}
