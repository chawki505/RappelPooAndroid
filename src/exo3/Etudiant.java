package exo3;

import java.util.ArrayList;

public class Etudiant extends Personne {

    private int numEtudiant;
    private String specialite;
    private ArrayList<Matiere> matieres = new ArrayList<>();


    public Etudiant(String nom, String prenom, String CIN, int numEtudiant, String specialite) {
        super(nom, prenom, CIN);
        this.numEtudiant = numEtudiant;
        this.specialite = specialite;
    }


    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }


    public ArrayList<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(ArrayList<Matiere> matieres) {
        this.matieres = matieres;
    }

    public void ajouterMatiere(Matiere matiere) {
        matieres.add(matiere);
        matiere.ajouterEtudiant(this);
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "numEtudiant=" + numEtudiant +
                ", specialite='" + specialite + '\'' +
                ", matieres=" + matieres +
                '}';
    }
}
