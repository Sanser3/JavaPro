package mein.JavaPro.HomeWork.HomeWork3.TimeArrayList.TimeArray;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Создать список ArrayList. Провести 10 тысяч вставок, удалений новых элементов и
 * измерить сколько времени в миллисекундах занимает 10 тысяч вставок для каждого списка,
 * и  сколько времени занимает 10 тысяч удалений для каждого списка.
 */
public class TimeArrayDemo {
    public static void main(String[] args) {
        TimeArray timeArray = new TimeArray();
//        измеряем время создания
        Date startTimePaste = new Date();
        timeArray.timeArrayPaste();
        Date finishTimePaste = new Date();
        long countPaste = finishTimePaste.getTime() - startTimePaste.getTime();
        System.out.println("время создания = " + countPaste + " Ms");

        ArrayList<Integer> list = new ArrayList<>(); // создаем список
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            list.add(random.nextInt(10_000));
        }
//        измеряем время удаления
        Date startTimeDelete = new Date();
        timeArray.timeArrayDelete(list);
        Date finishTimeDelete = new Date();
        long countDelete = finishTimeDelete.getTime() - startTimeDelete.getTime();
        System.out.println("время удаления = " + countDelete + " Ms");
    }
}
