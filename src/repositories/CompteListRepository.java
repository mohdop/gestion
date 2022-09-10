package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Compte;

public class CompteListRepository {
    List<Compte> comptes=new ArrayList<>();
    public Compte save(Compte compte){
        compte.add(compte);
        return compte;
    }
    public List<Compte> findAll(){
        return comptes;
    }
    public Compte findByTelephone(String num){
        return comptes
        .stream()
        .filter(a-> a.getNumero().compareTo(num)==0)
        .findFirst()
        .orElse(null);
    }
}
