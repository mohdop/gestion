package services;
import java.util.List;

import entities.Agence;
import repositories.AgenceRepository;
public class BanqueService {

    AgenceRepository  agenceRepository = new AgenceRepository();
    public List<Agence> listerAgence(){
        return agenceRepository.findAll();
    } 
    public Agence ajouterAgence (Agence agence){
        return agenceRepository.insert(agence);
    }

    public Agence rechercherAgenceParNumero (String num){
        return agenceRepository.findByNumero(num);
    }
}
