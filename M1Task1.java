import java.util.Scanner;

public class M1Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double a = scan.nextDouble();
        if (a < 0){
            System.out.println("Число отрицательное");
        }
        else {
            if (a > 0){
                System.out.println("Число положительное");
            }
            else {
                System.out.println("Число равно 0");
            }
        }
    }
}
