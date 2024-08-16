import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время в часах");
        int hour = scan.nextInt();
        if (hour >= 0 && hour <6){
            System.out.println("Good Nigth");
        }
        else {
            if(hour >= 6 && hour < 13){
                System.out.println("Good Morning");
            }
            else {
                if(hour >= 17 && hour < 24)
                {
                    System.out.println("Good Evening");
                }
                else {
                    System.out.println("Вы ввели неверное время");
                }
            }
        }
    }
}
