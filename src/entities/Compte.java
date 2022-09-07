package entities;

public class Compte {
    protected static int nbr;
    //id numero solde type
    protected int id;
    protected String numero;
    protected double solde;
    protected String type;

    public Compte(double solde, String type) {
        this.solde = solde;
        this.type = type;
    }
    public Compte ()
    {
        nbr++;
        id=nbr;
        numero="CPT_"+nbr;
    }
    public static int getNbr() {
        return nbr;
    }
    public static void setNbr(int nbr) {
        Compte.nbr = nbr;
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
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + ", type=" + type + "]";
    }
}
