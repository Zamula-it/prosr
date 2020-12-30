package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество уникальных значений
 * (встречающихся в массиве один раз). Вывести на консоль
 * значения уникальных элементов и индексы, под которыми
 * они находятся в массиве.
 *
 *  Пример:
 *      -5 -> 0 индекс
 *      3 -> 1 индекс
 *      4 -> 2 индекс
 *      2 -> 3 индекс
 *      0 -> 4 индекс
 *      -2 -> 5 индекс
 *      -4 -> 6 индекс
 *      -1 -> 9 индекс
 */
public class Task06 {

    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest06
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        int[] arr = new int[10];
        final int MIN = -5;
        final int MAX = 5;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(MAX - MIN + 1) +MIN;
        }
        // -5 5 2 2 2 3 3 4
        int[] count =  new int[MAX - MIN + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] + MAX]++;

        }
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i] + MAX] == 1) {
                System.out.printf("%d ->  %d индекс\n", arr[i], i);
            }
        }
    }
}


