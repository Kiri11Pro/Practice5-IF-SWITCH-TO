import java.util.Scanner;

public class TOTask3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название планеты");
        String planet = scan.nextLine();
        String earth1 = "Земля";
        String earth2 = "земля";
        boolean x = planet.equals(earth2) || planet.equals(earth1);
        String msg = x ? "Привет, землянин!" : "Привет, инопланетянин!";
        System.out.println(msg);
    }
}
