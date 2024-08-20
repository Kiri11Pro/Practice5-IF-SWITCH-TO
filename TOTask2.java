import java.util.Scanner;

public class TOTask2 {
    public static void main(String[] args) {
        String msg, msg1, msg2;
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        x = scan.nextInt();
        msg1 = "Число кратно 5";
        msg2 = "Число некратно 5";
        msg = x % 5 == 0 ?  msg1 : msg2;
        System.out.println(msg);
    }
}
