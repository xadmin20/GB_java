package com.intentg.Lessoin3;


import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/// 1. Написать итератор, который будет выдавать N случайных целых чисел

public class IteratorHomeWork implements Iterable<Integer> {
    public int inputNumbers;

    public IteratorHomeWork(int inputNumbers) {
        this.inputNumbers = inputNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какое колличество чисел вы хотите получить?: ");

        int inputNumbers = scanner.nextInt();
        IteratorHomeWork iterator = new IteratorHomeWork(inputNumbers);
        for (Integer RandomNumbers : iterator) {
            System.out.println(RandomNumbers);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Random randomNumbers = new Random();
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < inputNumbers;
            }

            @Override
            public Integer next() {
                int random = randomNumbers.nextInt(99);
                count++;
                return random;
            }
        };
    }
}