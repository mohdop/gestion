package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.CarteGab;

public class CarteGabListRepository {
    List<CarteGab> cartes= new ArrayList<>();
    
    public void CarteGab(){
        cartes.add(new CarteGab("22/03/2012"));
        cartes.add(new CarteGab("08/07/2018"));
        cartes.add(new CarteGab("01/11/2021"));
        cartes.add(new CarteGab("20/09/2016"));
        cartes.add(new CarteGab("05/04/2022"));
    }
    public CarteGab save (CarteGab carte){
        cartes.add(carte);
        return carte;
    }
    public List<CarteGab> findAll(){
        return cartes;
    }
    public CarteGab findByNumero(String num){
        //stream
        return cartes
        .stream()
        .filter(a->a.getNumero().compareTo(num)==0)
        .findFirst().orElse(null);
        
    }
}
