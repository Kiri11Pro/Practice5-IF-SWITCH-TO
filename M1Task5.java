import java.util.Scanner;

public class M1Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты точки");
        System.out.println("Введите координату x");
        int x = scan.nextInt();
        System.out.println("Введите координту y");
        int y = scan.nextInt();
        if (x > 0 && y > 0){
            System.out.println("Точка находится в первой четверти");
        }
        else {
            if (x < 0 && y > 0){
                System.out.println("Точка находится во второй четверти");
            }
            else {
                if(x < 0 && y < 0){
                    System.out.println("Точка находится в третьей четверти");
                }
                else {
                    if (x > 0 && y < 0){
                        System.out.println("Точка находится в четвертой четверти");
                    }
                    else {
                        if(x == 0 && y != 0){
                            System.out.println("Точка находится на оси Y");
                        }
                        else {
                            if (y == 0 && x != 0){
                                System.out.println("Точка находится на оси X");
                            }
                            else
                                System.out.println("Точка находится в начале координат");
                        }
                    }
                }
            }
        }
    }
}
