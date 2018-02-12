package exo4;

public class Personne {
    private String nom;
    private String prenom;
    private int numCarte;
    private static int compteur = 1;


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.numCarte = compteur;
        compteur++;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numCarte=" + numCarte +
                '}';
    }
}
