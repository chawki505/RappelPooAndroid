package exo5;

import java.util.Date;

public class Pret {

    private Adherent adherent;
    private Livre livre;
    private Date pret;
    private Date retour;


    public Pret(Adherent adherent, Livre livre, Date pret, Date retour) {
        this.adherent = adherent;
        this.livre = livre;
        this.pret = pret;
        this.retour = retour;
    }


    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Date getPret() {
        return pret;
    }

    public void setPret(Date pret) {
        this.pret = pret;
    }

    public Date getRetour() {
        return retour;
    }

    public void setRetour(Date retour) {
        this.retour = retour;
    }


    @Override
    public String toString() {
        return "Pret{" +
                "adherent=" + adherent +
                ", livre=" + livre +
                ", pret=" + pret +
                ", retour=" + retour +
                '}';
    }
}
