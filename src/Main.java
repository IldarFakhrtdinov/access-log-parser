import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число 1 и нажмите Enter");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите число 2 и нажмите Enter");
        int number2 = new Scanner(System.in).nextInt();
        System.out.println("Сумма: " + (number2+number1));
        System.out.println("Разность: " + (number1-number2));
        System.out.println("Произведение: " + (number1*number2));
        System.out.println("Частное: " + ((double)number1/number2));

    }
}