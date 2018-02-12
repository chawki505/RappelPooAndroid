package exo5;

import java.util.Date;

public class Adherent {

    private int num;
    private String nom, prenom;
    private Date date;
    private String adresse;
    private String tel;

    public Adherent(int num, String nom, String prenom, Date date, String adresse, String tel) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.adresse = adresse;
        this.tel = tel;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "num=" + num +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date=" + date +
                ", adresse='" + adresse + '\'' +
                ", tel=" + tel +
                '}';
    }
}
