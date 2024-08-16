import java.util.Scanner;

public class M1Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scan.nextInt();
        if (age >=0 && age <= 120)
            System.out.println("Возраст введен верно");
        else
            System.out.println("Возраст введен некоректно");
    }
}
