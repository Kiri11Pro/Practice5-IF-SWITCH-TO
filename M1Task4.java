import java.util.Scanner;

public class M1Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время");
        System.out.println("Часы");
        int hour = scan.nextInt();
        System.out.println("Минуты");
        int min = scan.nextInt();
        System.out.println("Секунды");
        int sec = scan.nextInt();
        if ( hour >= 0 && hour < 24 && min >= 0 && min < 60 && sec >= 0 && sec < 60)
            System.out.println("Время " + hour + ":" + min + ":" + sec);
        else System.out.println("Время введено неверно");
    }
}
