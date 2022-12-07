import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dz_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вывести все простые числа от 1 до 1000: ");
        int input = 1000;
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        // loop through the numbers one by one (edit include input in range)
        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

            // print the number if prime
            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        String answer = primes.toString().replace("[", "").replace("]", "");
        System.out.println("Всего чисел: " + primes.size());
        System.out.println(answer);
    }
}