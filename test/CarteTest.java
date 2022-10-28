

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;


class CarteTest {

    static Carte carte1;
    static Carte carte2;

    static Carte carte3;
    static Carte carte4;

    @org.junit.jupiter.api.BeforeAll
    static void setCartes() {
        carte1 = new Carte(NumeroDeLaCarte.sept, CouleurDeLaCarte.Tr);
        carte2 = new Carte(NumeroDeLaCarte.cinq, CouleurDeLaCarte.Co);
        carte3 = new Carte(NumeroDeLaCarte.dix, CouleurDeLaCarte.Ca);
        carte4 = new Carte(NumeroDeLaCarte.deux, CouleurDeLaCarte.Pi);
    }


    @org.junit.jupiter.api.Test
    void compareTo() {
        int test1= carte1.compareTo(carte2);
        int res1= 1;
        assertEquals(test1, res1);


    }
}