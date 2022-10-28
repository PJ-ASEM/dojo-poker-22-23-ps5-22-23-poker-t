

public enum NumeroDeLaCarte {
    deux(2, "2"), trois(3, "3"),quatre(4, "4"),cinq(5, "5"),six(6, "6"),
    sept(7, "7"),huit(8, "8"),neuf(9, "9"),dix(10, "10"),
    valet(11, "VA"), dame(12, "DA"), roi(13, "RO"),as(14, "AS");

    private final String name;
    private int numero;

    private NumeroDeLaCarte(int n, String name){
        this.name = name;
        this.numero=n;

    }

    public int getNumero(){return numero;}

    public String getName() {return name;}
}
