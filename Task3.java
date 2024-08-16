import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scan.nextDouble();
        System.out.println("Введите второе число");
        double b = scan.nextDouble();
        System.out.println("Введите третье число");
        double c = scan.nextDouble();
        double max;
        if(a > b && a > c ){
            max = a;
        }
        else {
            if(b > a && b > c){
                max = b;
            }
            else max = c;
        }
        double min;
        if(a < b && a < c ){
            min = a;
        }
        else {
            if(b < a && b < c){
                min = b;
            }
            else min = c;
        }
        double sr = (a + b + c) / 3;
        System.out.println("Выберите что найти");
        System.out.println("1 - максимальное число из трех");
        System.out.println("2 - минимальное число из трех");
        System.out.println("3 - среднеарифмитическое трех чисел");
        int option = scan.nextInt();
        if (option == 1){
            System.out.println("Максимальное число - " + max);
        }
        else {
            if (option == 2){
                System.out.println("Минимальное число - " + min);
            }
            else {
                if (option == 3){
                    System.out.println("Среднеарифмитическое - " + sr);
                }
                else {
                    System.out.println("Вы ввели неверную команду");
                }
            }
        }

    }
}
