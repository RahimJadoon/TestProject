package Inheritance;

public class weddingCake extends cake {
    private int tiers;

    public weddingCake(){
    super("Vanila");
    }
    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }



}
