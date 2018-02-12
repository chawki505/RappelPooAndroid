import exo5.Adherent;
import exo5.GestionMediateque;
import exo5.Livre;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //la biblioteque
        GestionMediateque gestionMediateque = new GestionMediateque("CCF");


        //les objets
        Adherent adherent = new Adherent(1, "chawki", "chouib", new Date(1996, 8, 12), "adresse", "tel");
        Adherent adherent2 = new Adherent(2, "ibtissem", "djeziri", new Date(1995, 12, 19), "adresse", "tel");
        Livre livre = new Livre(1, "titre", "auteur", "motCle", new Date());
        Livre livre2 = new Livre(2, "titre", "auteur", "motCle", new Date());


        //interation

        //ajouter aderent
        gestionMediateque.ajouterAdehrent(adherent);
        gestionMediateque.ajouterAdehrent(adherent2);
        //ajouter livre
        gestionMediateque.ajouterLivre(livre);
        gestionMediateque.ajouterLivre(livre2);


        //faire un pret
        gestionMediateque.pretLivre(adherent, livre);
        gestionMediateque.pretLivre(adherent2, livre2);


    }


}
