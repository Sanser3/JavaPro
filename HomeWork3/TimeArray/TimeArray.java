package mein.JavaPro.HomeWork.HomeWork3.TimeArrayList.TimeArray;

import java.util.ArrayList;
import java.util.Random;

public class TimeArray {

    public void timeArrayPaste() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            arrayList.add(random.nextInt(10_000));
        }
    }

    public void timeArrayDelete(ArrayList<Integer> arrayList) {
        for (int i=0;i<10_000;i++) {
            arrayList.remove(0);
        }
    }
}
