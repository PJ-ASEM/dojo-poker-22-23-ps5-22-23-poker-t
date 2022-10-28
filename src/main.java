
public class main {
    public static void main(String[] args) {


        String[] tabHand1 = Carte.handInit();
        String[] tabHand2= Carte.handInit();
        Joueur joueur1 = new Joueur("joueur1", tabHand1);
        Joueur joueur2 = new Joueur("joueur2", tabHand2);

        Jeu Game = new Jeu(joueur1,joueur2);



//        String carte1;
//        String carte2;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Entrez une carte :");
//        carte1 = sc.next();

//        System.out.println("Entrez une carte :");
//        carte2 = sc.next();

//        Carte.compareTo(carte1,carte2);


    }
}