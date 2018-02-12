package exo4;

import java.util.ArrayList;

public class Banque {

    private String adresse;
    private String nom;
    private ArrayList<Compte> comptesList = new ArrayList<>();
    private ArrayList<Personne> clientsList = new ArrayList<>();


    public Banque(String adresse, String nom) {
        this.adresse = adresse;
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Compte> getComptesList() {
        return comptesList;
    }

    public void setComptesList(ArrayList<Compte> comptesList) {
        this.comptesList = comptesList;
    }

    public ArrayList<Personne> getClientsList() {
        return clientsList;
    }

    public void setClientsList(ArrayList<Personne> clientsList) {
        this.clientsList = clientsList;
    }


    public void creeClient(String nom, String prenom) {

        Personne personne = new Personne(nom, prenom);

        Compte compte = new Compte(personne, this);


        comptesList.add(compte);

        clientsList.add(personne);

        System.out.println(personne + " creer !!");
    }


    public void removeClient(int indice) {

        comptesList.remove(indice);
        clientsList.remove(indice);

        System.out.println(" suprimer !");
    }


    public void depot(float somme, int IDCompte) {

        comptesList.get(IDCompte).setSolde(comptesList.get(IDCompte).getSolde() + somme);
    }

    public void retrait(float somme, int IDCompte) {

        comptesList.get(IDCompte).setSolde(comptesList.get(IDCompte).getSolde() - somme);
    }

    public void afficheClient() {
        for (int i = 0; i < clientsList.size(); i++) {

            System.out.println(clientsList.get(i));
        }
    }


    @Override
    public String toString() {
        return "Banque{" +
                "adresse='" + adresse + '\'' +
                ", nom='" + nom + '\'' +
                ", comptesList=" + comptesList +
                ", clientsList=" + clientsList +
                '}';
    }
}
