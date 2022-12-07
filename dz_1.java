
/**
 * dz_1
 */
import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            int n = iScanner.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i != n) {
                    System.out.print(i + "+");
                } else {
                    System.out.print(i + "=");
                }
            }
            System.out.print(n * (n + 1) / 2);
        }
    }

}