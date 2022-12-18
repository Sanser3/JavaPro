package JavaPro.HomeWord.HomeWork2.PokerTask1;

import java.util.ArrayList;

public class CardDeck {
    ArrayList<String> arrayList = new ArrayList<>();

    public String suitValueCardRandom(){

        String [] suits = {"Бубны", "Червы", "Трефы", "Пики"};
        String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        int valueSuits = (int) (Math.random() * suits.length);
        int valueValues = (int) (Math.random() * values.length);
        String temporalValue = values[valueValues] + " - " + suits[valueSuits];

        if (!arrayList.contains(temporalValue)){
            arrayList.add(temporalValue);
            return temporalValue;
        }else {
            return suitValueCardRandom();
        }

    }

}
