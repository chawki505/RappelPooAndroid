package exo5;

import java.util.ArrayList;
import java.util.Date;

public class GestionMediateque {


    private String nom;
    private ArrayList<Livre> livreArrayList = new ArrayList<>();
    private ArrayList<Adherent> adherentArrayList = new ArrayList<>();

    private ArrayList<Pret> pretArrayList = new ArrayList<>();


    public GestionMediateque(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Livre> getLivreArrayList() {
        return livreArrayList;
    }

    public void setLivreArrayList(ArrayList<Livre> livreArrayList) {
        this.livreArrayList = livreArrayList;
    }

    public ArrayList<Adherent> getAdherentArrayList() {
        return adherentArrayList;
    }

    public void setAdherentArrayList(ArrayList<Adherent> adherentArrayList) {
        this.adherentArrayList = adherentArrayList;
    }

    public ArrayList<Pret> getPretArrayList() {
        return pretArrayList;
    }

    public void setPretArrayList(ArrayList<Pret> pretArrayList) {
        this.pretArrayList = pretArrayList;
    }


    public void ajouterAdehrent(Adherent adherent) {
        if (!isExisteAdherent(adherent)) {
            adherentArrayList.add(adherent);
        }
    }

    public void ajouterLivre(Livre livre) {
        if (!isExisteLivre(livre)) {
            livreArrayList.add(livre);
        }
    }

    private boolean isExistePret(Livre livre) {
        for (int i = 0; i < pretArrayList.size(); i++) {

            if (pretArrayList.get(i).getLivre().equals(livre))
                return true;
        }

        return false;
    }

    private boolean isExisteLivre(Livre livre) {

        for (int i = 0; i < livreArrayList.size(); i++) {

            if (livreArrayList.get(i).equals(livre))
                return true;
        }

        return false;
    }


    private boolean isExisteAdherent(Adherent adherent) {
        for (int i = 0; i < adherentArrayList.size(); i++) {

            if (adherentArrayList.get(i).equals(adherent))
                return true;
        }

        return false;
    }


    public void pretLivre(Adherent adherent, Livre livre) {
        if (isExisteAdherent(adherent) && isExisteLivre(livre) && !isExistePret(livre)) {
            Date date = new Date();
            pretArrayList.add(new Pret(adherent, livre, date, new Date(date.getYear(), date.getMonth() + 1, date.getDate())));
        } else
            System.out.println("deja emprunter");
    }


    public void retourLivre() {
        Date date = new Date();

        for (int i = 0; i < pretArrayList.size(); i++) {
            if (pretArrayList.get(i).getRetour().equals(date))
                pretArrayList.remove(i);
        }
    }


}
