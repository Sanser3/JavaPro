package mein.JavaPro.HomeWork.HomeWork4.IntegerList;

import java.util.LinkedList;
import java.util.List;

/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
добавить в список элемент (в начало и в конец)
узнать длину списка
удалить элемент из списка (по интексу и без) 
узнать пустой список или нет
обойти список и вывести на консоль каждый элемент.

 */
public class IntegerListDemo {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerList();

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);

        integerList.addStartOrEnd(list, 10, true);

        integerList.addStartOrEnd(list, 20, false);

        System.out.println(integerList.longList(list));

        integerList.removeFromListIndex(list, 0);

        integerList.removeFromListValue(list, 3);

        System.out.println(integerList.isEmptyList(list));

        integerList.showList(list);
    }
}
