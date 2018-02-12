package exo3;

import java.util.ArrayList;

public class Enseignant extends Personne {
    private String departement;
    private String specialite;
    private ArrayList<Matiere> enseigne = new ArrayList<>();


    public Enseignant(String nom, String prenom, String CIN, String departement, String specialite) {
        super(nom, prenom, CIN);
        this.departement = departement;
        this.specialite = specialite;
    }


    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public ArrayList<Matiere> getEnseigne() {
        return enseigne;
    }

    public void setEnseigne(ArrayList<Matiere> enseigne) {
        this.enseigne = enseigne;
    }


    public void ajouterMatiere(Matiere matiere) throws NombreModuleEnseignantException {

        if (enseigne.size() < 3)
            enseigne.add(matiere);
        else
            throw new NombreModuleEnseignantException();

    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "departement='" + departement + '\'' +
                ", specialite='" + specialite + '\'' +
                ", enseigne=" + enseigne +
                '}';
    }

}
