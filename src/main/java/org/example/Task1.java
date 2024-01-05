package org.example;

import java.util.Scanner;

public class Task1 {
    /**
     * Задача 1:
     * Напишите программу, которая будет принимать на вход число из консоли и на выход
     * будет выводить сообщение четное число или нет. Для определения четности числа
     * используйте операцию получения остатка от деления (операция выглядит так: '% 2').
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.printf("Number '%d' is even.", number);
        } else {
            System.out.printf("Number '%d' is odd.", number);
        }
    }
}
