
package blackjackpeli;

public class kortti {
    
   private int arvo;
        private int maa;
         
        String[] maat = {"Hertta", "Ruutu", "Pata", "Risti"};
        String[] arvot = {"Ässä", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
         
        kortti(int maa,int arvo){
             
            this.maa=maa;
            this.arvo=arvo;
        }
       
        public @Override String toString(){
            return arvot[arvo] + "," + maat[maa];
         
 
    }
        public int getArvo(){
            return arvo;
        }
        public int getMaa(){
            return maa;
}    
}
 