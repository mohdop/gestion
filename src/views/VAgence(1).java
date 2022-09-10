package views;

import java.util.Scanner;

import entities.Agence;
import services.BanqueService;

public class VAgence{
    public static void menu(){
        Scanner clavier= new Scanner(System.in);
        BanqueService banqueService = new BanqueService();
        int choix;

        do{
            System.out.println("1-Lister");
            System.out.println("2-Ajouter");
            System.out.println("3-Rechercher");
            System.out.println("4-Quitter");
            choix=clavier.nextInt();
            clavier.nextLine();

            switch(choix){
                case 1:
                        banqueService.listerAgence().forEach(System.out::println);
                    break;
                case 2:
                   // System.out.println
                   System.out.println("Enter le numero de telephone");
                   String tel=clavier.nextLine();
                   System.out.println("Enterer l'adresse");
                   String adresse=clavier.nextLine();
                   Agence agence = new Agence();
                   agence.setAdresse(adresse);
                   agence.setTel(tel);
                   banqueService.ajouterAgence(agence);

                break;
                case 3:
                    System.out.println("numero de l'agence");
                    String num=clavier.nextLine();
                    Agence ag = banqueService.rechercherAgenceParNumero(num);
                    if(ag!=null){
                        System.out.println(ag);
                    }else
                    {
                        System.out.println("cet Agence n'existe pas");
                    }
                break;
                default:
                    break;
            }

        }while (choix!=4);
    }
    
}