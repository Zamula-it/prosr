package ua.step.practice;

import java.util.Random;
import java.util.Scanner;

/**
 * Программа должна выводить слово Yes для симметрич-
 * ного массива и слово No – для несимметричного. Симме-
 * тричным считается массив, в котором значения элементов с
 * конца равно значению элементов с начала. Массив заполняется
 * пользователем вручную.
 * Размер массива (количество строк и колонок) задается при
 * запуске программы.
 *
 * Примеры значений для симметричного массива:
 * <p>
 * 1, 2, 3, 2, 1
 * 2, 2, 3, 2, 2
 * 1, 3, 2, 3, 1
 * 5, 4, 3, 4, 5
 *
 *
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] marr;
        // TODO: Пишите код здесь
        boolean flag = true;
        final int min = 0;
        int count = 0;
        System.out.println("enter the size");
        int size = scanner.nextInt();
        final int max = 33;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {


                if (arr[i][j] != arr[j][i])
                    flag = false;
            }
        }
        System.out.println("\n");
        System.out.println(flag ? "yes" : "no");
    }
}


