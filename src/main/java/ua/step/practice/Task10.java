package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными циф-
 * рами от 0 до 33. Найти элемент массива, который делится
 * без остатка на значение элемента слева и значение элемен-
 * та справа. Вывести на консоль значения исходного массива.
 * Вывести индекс найденного элемента, если такой не найден,
 * вывести -1. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 *      Исходный массив [31, 0, 30, 3, 23, 1, 20, 29, 16, 2, 13, 9, 18, 9, 2]
 *      Индекс элемента 12
 */
public class Task10 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest10
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь
        final int min = 0;
        int count = 0;


        final int max = 33;
        arr = new int[len];


        for (int i = 0; i < len; i++) {
            arr[i] = rnd.nextInt(max - min + 1) + min;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i] + " ");
        }
        for (int i = 1; i < len; i++) {

            if (arr[i] % arr[i - 1] == 0 && arr[i] % arr[i + 1] == 0) {
                System.out.println(arr[i] + "индекс\t" + i);
            } else {
                System.out.println("not found elements");
                break;
            }
        }
    }
}
