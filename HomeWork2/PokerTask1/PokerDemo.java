package JavaPro.HomeWord.HomeWork2.PokerTask1;

/**
 * Напишите программу, которая должна имитировать раздачу карт для игры в покер.
 * Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n игроков
 * (по 5 карт каждому) из рассортированной колоды.
 * Разделяйте пять карт, выданных каждому игроку, пустой строкой.
 */

public class PokerDemo {
    public static void main(String[] args) {

        PokerNumberInput numberInput = new PokerNumberInput();
        CardDeck cardDeck = new CardDeck();

        int n = numberInput.inputNumber();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 5; j++){
                System.out.println(cardDeck.suitValueCardRandom());
            }
            System.out.println();
        }

    }

}
