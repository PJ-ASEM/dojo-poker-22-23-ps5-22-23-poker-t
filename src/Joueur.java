

public class Joueur {
    String name;
    String[] hand;

    public Joueur(String name, String[] hand) {
        this.name = name;
        this.hand=hand;
    }

    public Joueur(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String[] getHand() {
        return hand;
    }






}
