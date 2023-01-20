package mein.JavaPro.HomeWork.HomeWork4.JavaUtilList;

/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует ответ на этот вопрос.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaUtilListDemo {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println("ArrayList: " + arrayList);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        System.out.println("LinkedList: " + linkedList);
    }
}
