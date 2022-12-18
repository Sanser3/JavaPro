package JavaPro.HomeWord.HomeWork2.ArrayTask3;

import java.util.Arrays;

/**
 * Найти сумму нечетных чисел в массиве
 */
public class ArrayDemo {
    public static void main(String[] args) {
        IntArrayPrimerRandom intArrayPrimer = new IntArrayPrimerRandom();

        int sum = 0;
        int[] arrayRandom = intArrayPrimer.intArrayRandom();
        for (int elem : arrayRandom) {
            if (elem % 2 == 1) {
                sum += elem;
            }
        }

        System.out.println(Arrays.toString(arrayRandom));
        System.out.println("Summa = " + sum);
    }

}
