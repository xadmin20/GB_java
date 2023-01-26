import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static ArrayList<Animal> allAnimal = new ArrayList<>();
    {
    allAnimal.add(new Cat("Барсик", "Персидский", "Да", "Черепаховый", "21.04.2014", 25, 7, "Серые", "да"));
    allAnimal.add(new Tiger(1500, 45, "голубые", "Африка", "12.04.1977"));
    allAnimal.add(new Dog("Шарик", "Двортерьер", "Нет", "Бежевый", "Неизвестно", 45, 35, "Карие", "Нет"));
    allAnimal.add(new Wolf(67, 45, "Голубые", "Россия", "31.12.2009", "Да"));
    allAnimal.add(new Hen(35, 2, "Желтые", 1));
    allAnimal.add(new Stork(45, 5, "Желтые", 0));
    }

    public int size(){
        return allAnimal.size();
    }





    public void addCat(Scanner input){
        String name;
        String breed;
        String vaccination;
        String color;
        String dateBirthday;
        int height;
        int weight;
        String colorEye;
        String wool;

        System.out.print("Имя: ");
        name = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccination = input.next();
        System.out.print("Введите цвет: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();

        Zoo.allAnimal.add(new Cat(name, breed, vaccination, color, dateBirthday, height, weight, colorEye, wool));
    }

    public void addDog(Scanner input){
        String name;
        String breed;
        String vaccination;
        String color;
        String dateBirthday;
        int height;
        int weight;
        String colorEye;
        String training;

        System.out.print("Имя: ");
        name = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccination = input.next();
        System.out.print("Введите цвет: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие дресировки: ");
        training = input.next();

        allAnimal.add(new Dog(name, breed, vaccination, color, dateBirthday, height, weight, colorEye, training));
    }

    public void addTiger(Scanner input){
        int height;
        int weight;
        String colorEye;
        String place;
        String date;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();

        allAnimal.add(new Tiger(height, weight, colorEye, place, date));
    }

    public void addWolf(Scanner input){
        int height;
        int weight;
        String colorEye;
        String place;
        String date;
        String leader;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();
        System.out.print("Вожак стаи?: ");
        leader = input.next();

        allAnimal.add(new Wolf(height, weight, colorEye, place, date, leader));
    }

    public void addHen(Scanner input){
        int height;
        int weight;
        String colorEye;
        int hightFly;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();

        allAnimal.add(new Hen(height, weight, colorEye, hightFly));
    }

    public void addStork(Scanner input){
        int height;
        int weight;
        String colorEye;
        int hightFly;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();

        allAnimal.add(new Stork(height, weight, colorEye, hightFly));
    }

    void showAll(){
        int index = 0;
        for (Animal animal : allAnimal) {
            System.out.printf("%d) ", index);
            System.out.println(animal);
            System.out.println("----");
            index++;
        }
    }

    void removeAnimal(int num){
        allAnimal.remove(num);
    }

    void showAnimal(int num){
       System.out.println(allAnimal.get(num));
       if (allAnimal.get(num) instanceof Home){
        ((Home)allAnimal.get(num)).caressing();
       }
       if (allAnimal.get(num) instanceof BirdFly){
        ((BirdFly)allAnimal.get(num)).toFly();
       }  
    }

    void animalSay(int num) {
        allAnimal.get(num).animalSay();
    }

    void sayAllAnimals(){
        for (Animal animal : allAnimal) {
            animal.animalSay();
        }
    }
    
}
