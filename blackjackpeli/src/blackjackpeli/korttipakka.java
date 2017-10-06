package blackjackpeli;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import static javafx.beans.binding.Bindings.length;
import static javafx.scene.input.KeyCode.K;

public class korttipakka {

    public ArrayList<kortti> kortit = new ArrayList<>();

 
   

   public korttipakka(int pakkojenmaara) {
   String[] arvot = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jätkä", "kuningatar", "kuningas", "ässä"};
    String[] maat = {"pata", "hertta", "risti", "ruutu"};
    int[] korttienarvo = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    
    for(int i=2; i<=14; i++){
        kortit.add(new kortti("pata", i));
          kortit.add(new kortti("hertta", i));
            kortit.add(new kortti("risti", i));
              kortit.add(new kortti("ruutu", i));
              
    }
    }
   
     public kortti poistakortti(){
        this.kortit.remove(0);
        return
    }
     
    public void shuffleArray() {
        Random arpoja = new Random();
        for (int i = .length - 1; i > 0; i--) {
            int index = arpoja.nextInt(i + 1);

            int a = kortit[index];
            kortit[index] = kortit[i];
            kortit[i] = a;

        }

    }

}
