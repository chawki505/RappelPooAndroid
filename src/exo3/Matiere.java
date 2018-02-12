package exo3;

import java.util.ArrayList;

public class Matiere {


    private String intitule;
    private int VH;
    private Enseignant enseignant;
    private ArrayList<Etudiant> etudiants = new ArrayList<>();


    public Matiere(String intitule, int VH, Enseignant enseignant) {
        this.intitule = intitule;
        this.VH = VH;
        this.enseignant = enseignant;

        try {
            enseignant.ajouterMatiere(this);
        } catch (NombreModuleEnseignantException e) {
            System.out.println("Impossible d'ajouter " + this.intitule + " a " + enseignant.getNom());
        }

    }


    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getVH() {
        return VH;
    }

    public void setVH(int VH) {
        this.VH = VH;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }


    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "intitule='" + intitule + '\'' +
                ", VH=" + VH +
                ", enseignant=" + enseignant +
                ", etudiants=" + etudiants +
                '}';
    }
}
