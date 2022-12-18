package JavaPro.HomeWord.HomeWork2.PokerTask1;

import java.util.Scanner;

public class PokerNumberInput {

    public int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int resultat = scanner.nextInt();
        if (resultat <= 5){
            return resultat;
        }else {
            System.out.println("Число игроков должно быть 5 или меньше.");
            return inputNumber();
        }
    }

}
