package repositories;
import java.util.ArrayList;
import java.util.List;

import entities.Agence;
public class AgenceRepository {
    List<Agence> agences=new ArrayList<>();
    public AgenceRepository(){

    }
    public void initListAgence()
    {

        agences.add(new Agence("Point E","33 567 89 32"));
        agences.add(new Agence("Grand-Yoff","33 243 98 00"));
        agences.add(new Agence("Parcelles","33 900 06 55"));
    }
    public Agence insert (Agence agence){
        agences.add(agence);
        return agence;
    }
    public List<Agence> findAll()
    {
        return agences;
    }
    public Agence findByNumero(String num){
        //stream
        return agences
        .stream()
        .filter(a->a.getNumero().compareTo(num)==0)
        .findFirst().orElse(null);
        
    }
}
