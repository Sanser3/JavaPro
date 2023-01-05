package mein.JavaPro.HomeWork.HomeWork3.SortArrayList.SortArray;

import java.util.ArrayList;

/**
 * Пользователь вводит с клавиатуры список слов (и чисел).
 * Слова вывести в возрастающем порядке, числа - в убывающем.
 */

public class SortArrayDemo {
    public static void main(String[] args) {
        SortArrayInput sortArrayInput = new SortArrayInput();
        SortArray sortArray = new SortArray();

        ArrayList<String> list = sortArrayInput.arrayInput();
//        System.out.println(list);

        String[] array = list.toArray(new String[0]);
        sortArray.sort(array);

        for (String i : array) {
            System.out.println(i);
        }
    }
}
