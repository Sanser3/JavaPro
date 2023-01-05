package mein.JavaPro.HomeWork.HomeWork3.SortArrayList.SortArray;

public class SortArray {
    public void sort(String[] array){
        for (int i = 0; i < array.length; i++) { // перебор значений массива
            if (!(array[i].matches("[-+]?\\d+"))) { // проверка на число
                for (int j = 0; j < array.length; j++) {
                    if (!(array[j].matches("[-+]?\\d+"))) {
                        String temp = array[i];
                        if (!(array[i].compareTo(array[j]) > 0)) { // сравнения строк
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    if (array[j].matches("[-+]?\\d+")) {
                        String temp = array[i];
                        int t1 = Integer.parseInt(array[i]); // преобразует строку в число
                        int t2 = Integer.parseInt(array[j]);
                        if (t1 > t2) {
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
    }
}
