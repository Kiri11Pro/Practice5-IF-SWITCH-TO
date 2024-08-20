import java.util.Scanner;

public class TOTask1 {
    public static void main(String[] args) {
        double x, y, max;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        x = scan.nextDouble();
        System.out.println("Введите второе число");
        y = scan.nextDouble();
        max = x > y ? x : y;
        System.out.println("Наибольшее  число = " + max);
    }
}
