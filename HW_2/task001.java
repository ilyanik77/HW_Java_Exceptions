
import java.util.Scanner;

public class task001 {

    public static void main(String[] args) {

        inputFloat();
    }

    private static void inputFloat() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите дробное число (типа float): ");
            String input = sc.next();
            float num = Float.parseFloat(input);
            sc.close();
            System.out.println("Ваше число: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Введены некорректные данные");
            inputFloat();
        }

    }
}
