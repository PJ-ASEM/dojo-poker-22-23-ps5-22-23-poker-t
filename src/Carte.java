import java.util.Scanner;

public class Carte {
    public NumeroDeLaCarte numeroDeLaCarte;
    public CouleurDeLaCarte couleurDeLaCarte;

    Scanner sc= new Scanner(System.in);

    public Carte(NumeroDeLaCarte numeroDeLaCarte, CouleurDeLaCarte couleurDeLaCarte) {
        this.couleurDeLaCarte = couleurDeLaCarte;
        this.numeroDeLaCarte = numeroDeLaCarte;
    }

    public int getNumero() {
        return numeroDeLaCarte.getNumero();
    }

    public CouleurDeLaCarte getCouleur() {
        return couleurDeLaCarte;
    }


    public String toString(){
        return numeroDeLaCarte.getName()+couleurDeLaCarte;
    }


    public static String[] handInit(){
        System.out.println("Saisissez vos cartes :");
        Scanner sc= new Scanner(System.in);
        String hand = sc.nextLine();

        String[] tabHand = hand.split(" ");

        if(hand.length() < 5){
            System.out.println("Vous devez entrer 5 cartes");
        }
        else {
            for (String card : tabHand){
                System.out.println(card);
            }
        }
        return tabHand;
    }



    public int compareTo(Object carte) {
        if(numeroDeLaCarte.getNumero()>((Carte) carte).getNumero()){
            return 1;
        }else if (numeroDeLaCarte.getNumero()<((Carte) carte).getNumero()){
            return -1;
        }else {
            return 0;
        }
    }

}