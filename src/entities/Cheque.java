package entities;

import java.util.List;

public class Cheque extends  Compte{

    
    private List<CarteGab> carteGabs ;

   
    public List<CarteGab> getCarteGabs() {
        return carteGabs;
    }
    public void setCarteGabs(List<CarteGab> carteGabs) {
        this.carteGabs = carteGabs;
    }
    private Double frais;
    public Cheque(Double frais) {
        this.frais = frais;
    }
   
    @Override
    public String toString() {
        return "Cheque [frais=" + frais + "]";
    }
    
}
