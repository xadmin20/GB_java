# GB_java
 

 ### Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
```java
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
```

### Вывести все простые числа от 1 до 1000

```java
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
```



### Реализовать простой калькулятор

```java
import java.util.Scanner;
public class dz_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }
    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();// рекурсия
            num = getInt();
        }
        return num;
    }
    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();// рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());// рекурсия
        }
        return result;
    }
}

```