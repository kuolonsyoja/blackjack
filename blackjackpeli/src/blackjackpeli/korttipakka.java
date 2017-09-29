package blackjackpeli;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import static javafx.scene.input.KeyCode.K;

public class korttipakka {

    public ArrayList<kortti> kortit = new ArrayList<>();

 
   

   public korttipakka() {
   String[] arvot = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jätkä", "kuningatar", "kuningas"};
    String[] maat = {"pata", "hertta", "risti", "ruutu"};
    int[] korttienarvo = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    }

    public void shuffleArray() {
        Random arpoja = new Random();
        for (int i = pakka.length - 1; i > 0; i--) {
            int index = arpoja.nextInt(i + 1);

            int a = pakka[index];
            pakka[index] = pakka[i];
            pakka[i] = a;

        }

    }

}
