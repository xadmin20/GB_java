package com.intentg.Lessoin3;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class People implements Comparable<People> {
    public String name;
    public int weight;
    public int age;
    public int height;
    public int inputNumbers;


    public People(String name, int age, int height, int weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Студент |" + "ИМЯ ='" + name + ", ВОЗРАСТ =" + age + ", РОСТ =" + height + ", ВЕС =" + weight + '|';
    }


    public static void scanInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers = scanner.nextInt();
    }


    public static void main(String[] args) {

        System.out.print(" 1 - сортировка по ИМЕНИ" +
                "\n 2 - сортировка по ВОЗРАСТУ " +
                "\n 3-  сортировка по РОСТУ" +
                "\n 4 - сортировка по ВЕСУ" +
                "\n По какому параметру будем сортировать?  ");
        scanInputNumbers();
        ArrayList<People> arrayStudents = new ArrayList<>();
        arrayStudents.add(new People("Олег", 99, 12, 13));
        arrayStudents.add(new People("Борис", 83, 33, 13));
        arrayStudents.add(new People("Андрей", 5, 29, 67));
        arrayStudents.add(new People("Андрей", 52, 1, 72));
        arrayStudents.add(new People("Павел", 83, 22, 13));
        arrayStudents.add(new People("Петр", 73, 42, 113));
        arrayStudents.add(new People("Сергей", 77, 55, 19));
        Collections.sort(arrayStudents);
        for (People student : arrayStudents) {
            System.out.println(student);
        }
    }

// Сортировка по ИМЕНИ
    @Override
    public int compareTo(People o) {
        return this.name.compareTo(o.name);
    }

//// Сортировка по РОСТУ
//    @Override
//    public int compareTo(People o) {
//        return Integer.compare(this.height, o.height);
//    }

//// Сортировка по ВОЗРАСТУ
//    @Override
//    public int compareTo(People o) {
//        return Integer.compare(this.age, o.age);
//    }

//// Сортировка по ВЕСУ
//    @Override
//    public int compareTo(People o) {
//        return Integer.compare(this.weight, o.weight);
//    }

}