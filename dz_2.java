import java.util.ArrayList;
import java.util.List;

public class dz_2 {

    public static void main(String[] args) {
        System.out.println("Вывести все простые числа от 1 до 1000: ");
        int input = 1000;
        // создаем список
        List<Integer> primes = new ArrayList<>();
        // перебираем цифры по порядку
        for (int i = 2; i <= input; i++) {
            // ставим флаг
            boolean isPrimeNumber = true;
            // вторая итерация
            for (int j = 2; j < i; j++) {
                // проверяем чило делится оно на себя без остатка
                if (i % j == 0) {
                    // меняем флаг
                    isPrimeNumber = false;
                    // как нам на лекции говорили что не красиво брейками заканчивать итерацию. но
                    // нет выхода
                    break;
                }
            }
            // проверяем флаг
            if (isPrimeNumber) {
                // флаг Истина, значит записываем в переменную
                primes.add(i);
            }
        }
        // удаляем скобки и выводим результат
        String answer = primes.toString().replace("[", "").replace("]", "");
        System.out.println("Всего чисел: " + primes.size());
        System.out.println(answer);
    }
}