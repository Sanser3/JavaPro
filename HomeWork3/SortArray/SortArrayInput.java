package mein.JavaPro.HomeWork.HomeWork3.SortArrayList.SortArray;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayInput {

    public ArrayList<String> arrayInput(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        while (true) {
            System.out.print("Введите эллемент: ");
            String scann = scanner.nextLine();
            if (scann.isEmpty()) { // выход из цикла, если пустая строка
                break;
            }
            arrayList.add(scann);
        }

        scanner.close();

        return arrayList;
    }
}
