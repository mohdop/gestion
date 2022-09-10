package services;
import java.util.List;

import entities.Agence;
import entities.Client;
import entities.Compte;
import repositories.AgenceRepository;
import repositories.ClientListRepository;
import repositories.CompteListRepository;

public class BanqueService {

    AgenceRepository  agenceRepository = new AgenceRepository();
    CompteListRepository  compteListRepository = new CompteListRepository();
    ClientListRepository clientListRepository= new  ClientListRepository();
    public List<Agence> listerAgence(){
        return agenceRepository.findAll();
    } 
    public Agence ajouterAgence (Agence agence){
        return agenceRepository.insert(agence);
    }

    public Agence rechercherAgenceParNumero (String num){
        return agenceRepository.findByNumero(num);
    }
    public Compte ajouterCompte (Compte compte){
        return compteListRepository.save(compte);
    }
    public List<Compte> listerComptes(){
        return compteListRepository.findAll();
    }
    public Compte rechercherCompte(String num){
        return compteListRepository.findByTelephone(num);
    }
    public Client rechercherClient(String tel){
        return clientListRepository.findByTelephone(tel);
    }
    public boolean ajouterClient(Client client){
        return clientListRepository.save(client)!=null;
    }
}
