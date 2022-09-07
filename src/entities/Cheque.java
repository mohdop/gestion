package entities;

public class Cheque extends  Compte{

    private Double frais;
    
    public Cheque(Double frais) {
        this.frais = frais;
    }
    public Cheque(double solde, String type) {
        super(solde, type);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Cheque [frais=" + frais + "]";
    }
    
}
