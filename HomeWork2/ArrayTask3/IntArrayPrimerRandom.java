package JavaPro.HomeWord.HomeWork2.ArrayTask3;

public class IntArrayPrimerRandom {

    public int[] intArrayRandom(){
        int[] intArrayPrimer = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < intArrayPrimer.length; i++) {
            intArrayPrimer[i] = ((int) (Math.random() * 100));
        }
        return intArrayPrimer;
    }
}
