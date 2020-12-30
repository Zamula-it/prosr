package ua.step.practice;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;
/**
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        Random rnd = new Random(seed);
        Scanner scanner = new Scanner(System.in);
        final char Max = 'z';
        final int Min = 'a';
        int repeat = 0;
        int numArr = 0;
        int size;
        size = scanner.nextInt();
        char[] array = new char[size];
        int rand;
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            rand = r.nextInt(Max - Min + 1) + Min;
            array[i] = (char) rand;
        }
        for (char c : array)
            System.out.println(c);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[numArr] == array[j])
                    repeat++;
            }

            if (repeat > 3) {

                System.out.println(array[numArr] + " повторилось " + (repeat - 1) + "раз");
            }
            repeat = 0;
            numArr++;
        }
    }
}
