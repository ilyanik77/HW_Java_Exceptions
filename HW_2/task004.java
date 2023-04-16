import java.util.Scanner;

// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task004 {

    public static void main(String[] args) {
        inputData();
    }


    public static void inputData() {
        System.out.print("Введите Имя: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        sc.close();
        if (!data.isEmpty()){
            System.out.println("Вы ввели: " + data);
        } else {
            throw new RuntimeException("Пустую строку вводить нельзя");
        }

    }

}
