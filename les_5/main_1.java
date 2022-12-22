import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main_1 {
    public static void main(String[] args) {
        Map<String, List<String>> phonBook = new HashMap<>();
        phonBook.put("Николай", List.of("+79011234567", "+79011534567"));
        phonBook.put("Анна", List.of("+7901144567", "+79011434567"));
        phonBook.put("Егор", List.of("+79051234567", "+79011334567"));
        phonBook.put("Александр", List.of("+79011234567", "+79011774567"));
        phonBook.put("Дмитрий", List.of("+79001234567", "+79011234007"));
        menu(phonBook);
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }

    public static void find(Map<String, List<String>> phonBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(phonBook.get(name));
    }

    public static void allBook(Map<String, List<String>> phonBook) {
        System.out.println(phonBook);
    }

    public static void add(Map<String, List<String>> phonBook) {
        System.out.println("Чтобы прекратить вводить номера телефонов достаточно написать end");
        System.out.println("Введите имя: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер телефона " + name + ": ");
            String phon = scanner();
            if (phon.equals("end")) {
                break;
            } else {
                number.add(phon);
            }
        }
        phonBook.put(name, number);
    }

    public static void menu(Map<String, List<String>> phonBook) {
        System.out.println(
                "Введите команду из списка: search - найти контакт, + - добавить контакт," +
                        " all - показать всю телефонную книгу, exit - выйти");
        while (true) {
            String comands = scanner();
            if (comands.equals("exit")) {
                break;
            } else {
                switch (comands) {
                    case "search" -> find(phonBook);
                    case "+" -> add(phonBook);
                    case "all" -> allBook(phonBook);
                    default -> {
                    }
                }
            }
        }
    }
}
