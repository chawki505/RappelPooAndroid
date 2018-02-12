package exo4;

public class Compte {
    private int ID;
    private Personne personne;
    private float solde;
    private Banque banque;
    private static int compteur = 1;


    public Compte(Personne personne, Banque banque) {
        this.ID = compteur;
        this.personne = personne;
        this.solde = 0;
        this.banque = banque;
        compteur++;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }


    public void deposer(int somme) {
        solde = solde + somme;
    }

    public void retirer(int somme) {
        solde = solde - somme;
    }


    public void consultation() {
        System.out.println("solde : " + solde + " $");
    }

    @Override
    public String toString() {
        return "Compte{" +
                "ID=" + ID +
                ", solde=" + solde +
                '}';
    }
}
