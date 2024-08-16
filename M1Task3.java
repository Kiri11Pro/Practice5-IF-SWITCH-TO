import java.util.Scanner;

public class M1Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double num = scan.nextDouble();
        if (num < 0)
            num = num * (-1);
        System.out.println("Модуль числа = " + num);

    }
}
