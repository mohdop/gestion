package entities;

public class Epargne extends Compte {

    private Double taux;
    public Epargne(Double taux) {
        this.taux = taux;
    }
    public Epargne(double solde, String type) {
        super(solde, type);
        //TODO Auto-generated constructor stub
    }
    public Double getTaux() {
        return taux;
    }
    public void setTaux(Double taux) {
        this.taux = taux;
    }
    
}
