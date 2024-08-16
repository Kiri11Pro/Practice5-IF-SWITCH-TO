import java.util.Scanner;

public class M1STask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа и действие");
        System.out.println("Введите первое число");
        double a = scan.nextDouble();
        System.out.println("Введите второе число");
        double b = scan.nextDouble();
        System.out.println("Введите действие +; -; *; /");
        String option = scan.nextLine();
        String sum = "+";
        if (option.equals(sum))
        System.out.println(a+b);


    }
}
