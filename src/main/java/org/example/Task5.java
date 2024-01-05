package org.example;

import java.util.Scanner;

public class Task5 {
    /**
     * Задача *:
     * Напишите программу, где пользователь вводит любое целое положительное число.
     * А программа суммирует все числа от 1 до введенного пользователем числа.
     * Для ввода числа воспользуйтесь классом Scanner.
     * Сделать проверку, чтобы пользователь не мог ввести некорректные данные.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            int sumOfNumbers = 0;
            System.out.print("Sum of next array {");
            for (int i = 1; i <= number; i++) {
                sumOfNumbers += i;

                if (i == number) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }

            }
            System.out.print("} is: " + sumOfNumbers);
        } else {
            System.out.println("Entered negative number: " + number);
        }
    }
}
