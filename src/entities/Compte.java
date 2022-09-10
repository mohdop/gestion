package entities;

import java.util.List;

abstract public class Compte {
    private static int nbr;
    protected Client client;
    protected Agence agence;
   
    //id numero solde type
    protected int id;
    protected String numero;
    protected double solde;
    protected Type_Compte typeCompte;



    public Type_Compte getTypeCompte() {
        return typeCompte;
    }
    public void setTypeCompte(Type_Compte typeCompte) {
        this.typeCompte = typeCompte;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Compte(double solde) {
        nbr++;
        id=nbr;
        numero="CPT_"+nbr;
        this.solde = solde;
        
    }
    public Compte ()
    {
        nbr++;
        id=nbr;
        numero="CPT_"+nbr;
    }
    public static int getNbr() {
        return nbr;
    }
    public static void setNbr(int nbr) {
        Compte.nbr = nbr;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    @Override
    public String toString() {
        return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + "]";
    }
    public void add(Compte compte) {
    }
}
