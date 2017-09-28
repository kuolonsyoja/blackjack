
package blackjackpeli;

public class kortti {
    
   private int arvo;
        private String maa;
    
         
        
       
@Override
public String toString() {
    return cardValue + " of " + suit;
}


public card(String suit, String cardValue) {
    this.suit = suit;
    this.cardValue = cardValue;
}


public card(String cardValue) {
    this.cardValue = cardValue;
}

public String getSuit() {
    return suit;
}

public void setSuit(String suit) {
    this.suit = suit;
}
 