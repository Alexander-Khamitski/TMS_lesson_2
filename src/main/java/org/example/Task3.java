package org.example;

public class Task3 {
    /**
     * Задача 3:
     * Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
     */
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            System.out.printf("%d squared is: " + i * i + "\n", i);
        }
    }
}
