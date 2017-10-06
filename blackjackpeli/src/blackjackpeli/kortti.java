package kortit;

public class kortti {

    private final int arvo;
    private final int maa;
    private boolean lukitus;
    public final String[] maat = {"♥", "♦", "♠", "♣"};
    public final String[] arvot = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public kortti(int maa, int arvo) {
        this.arvo = arvo;
        this.maa = maa;
        this.lukitus = false;
    }

    public int haeArvo() {
        return this.arvo;
    }

    public int haeMaa() {
        return this.maa;
    }

    public void lukitse() {
        this.lukitus = true;
    }

    public void avaa() {
        this.lukitus = false;
    }
    
    public boolean olenkoLukittu() {
        return this.lukitus;
    }
    
    @Override
    public String toString() {
        return this.maat[this.maa] + this.arvot[this.arvo];
    }
}