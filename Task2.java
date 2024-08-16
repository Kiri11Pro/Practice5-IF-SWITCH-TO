import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scan.nextDouble();
        System.out.println("Введите второе число");
        double b = scan.nextDouble();
        System.out.println("Введите третье число");
        double c = scan.nextDouble();
        System.out.println("Выберите действие \n 1 - найти сумму чисел \n 2 - найти произведение чисел");
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("Сумма чисел - " + (a + b + c));
        }
            else{
                System.out.println("Произведение чисел - " + (a * b * c));
            }

    }
}
