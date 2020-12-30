package ua.step.practice;

import java.util.Scanner;

/**
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();



        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 1 3 1 4 5
        boolean yes = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                yes = false;
                break;
            }

        }
        System.out.println(yes ? "Yes" : "No");
    }
}


