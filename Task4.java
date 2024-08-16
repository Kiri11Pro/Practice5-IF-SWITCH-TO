import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество метров");
        double m = scan.nextDouble();
        System.out.println("Выберите во что перевести метры");
        System.out.println("1 - мили\n2 - дюймы\n3 - ярды");
        double mili = m / 1609.34;
        double d = m * 39.37;
        double ya = m * 1.09;
        int option = scan.nextInt();
        if(option == 1){
            System.out.println(mili + " миль");
        }
        else {
            if (option == 2){
                System.out.println(d + " дюймов");
            }
            else {
                if (option == 3){
                    System.out.println(ya + " ярдов");
                }
                else {
                    System.out.println("Неверная команда");
                }
            }
        }
    }
}
