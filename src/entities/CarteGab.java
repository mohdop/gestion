package entities;

public class CarteGab {
    private static int nbr;
    private int id;
    private String numero;
    private String dateExp;
    
    public CarteGab(String dateExp) {
        this.dateExp = dateExp;
    }

    public CarteGab() {
        nbr++;
        id=nbr;
        numero="CG_"+nbr;
    }

    public static int getNbr() {
        return nbr;
    }

    public static void setNbr(int nbr) {
        CarteGab.nbr = nbr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDateExp() {
        return dateExp;
    }

    public void setDateExp(String dateExp) {
        this.dateExp = dateExp;
    }

    @Override
    public String toString() {
        return "CarteGab [dateExp=" + dateExp + ", id=" + id + ", numero=" + numero + "]";
    }

}
