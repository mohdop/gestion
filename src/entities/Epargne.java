package entities;

public class Epargne extends Compte {

    private Double taux;
    public Epargne(Double taux) {
        this.taux = taux;
    }
    
    public Double getTaux() {
        return taux;
    }
    public void setTaux(Double taux) {
        this.taux = taux;
    }
    
}
