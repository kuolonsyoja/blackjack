package blackjackpeli;

public class kortti {

    private int arvo;
    private String maa;

    @Override
    public String toString() {
        return arvo + maa;
    }

    public kortti(String maa, int arvo) {
        this.maa = maa;
        this.arvo = arvo;
    }

    public String getSuit() {
        return maa;
    }

    public void setSuit(String maa) {
        this.maa = maa;
    
    
     public int getArvo() {
        return arvo;
     }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    
    }
    
}
    
    
    
    
}
