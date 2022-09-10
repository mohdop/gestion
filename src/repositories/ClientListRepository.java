package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientListRepository {
    List<Client> clients=new ArrayList<>();
    public Client save(Client client){
        clients.add(client);
        return client;
    }
    public List<Client> findAll(){
        return clients;
    }
    public Client findByTelephone(String tel){
        return clients
        .stream()
        .filter(cl-> cl.getTel().compareTo(tel)==0)
        .findFirst()
        .orElse(null);
    }
}
