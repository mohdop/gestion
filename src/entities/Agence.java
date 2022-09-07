package entities;

public class Agence {
    //attribut static
    private static int nbr;
    //attribut Instance
    private int id;
    private String numero;
    private String adresse;
    private String tel;

    public Agence(String adresse, String tel) {
        this.adresse = adresse;
        this.tel = tel;
    }

    //constructeur par défaut
    public Agence()
    {
        nbr++;
        id=nbr;
        numero="AG_"+nbr;
    }

    //surcharge d'insertion

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
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    //Sérialistion prend un objet pour le transformer en chaîne
    public String toString() {
        return "Agence [adresse=" + adresse + ", id=" + id + ", numero=" + numero + ", tel=" + tel + "]";
    }
    
}
