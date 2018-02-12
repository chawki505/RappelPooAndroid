package exo5;

import java.util.Date;

public class Livre {
    private int num;
    private String titre,auteur,motCle;
    private Date annee;

    public Livre(int num, String titre, String auteur, String motCle, Date annee) {
        this.num = num;
        this.titre = titre;
        this.auteur = auteur;
        this.motCle = motCle;
        this.annee = annee;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "num=" + num +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", motCle='" + motCle + '\'' +
                ", annee=" + annee +
                '}';
    }
}
