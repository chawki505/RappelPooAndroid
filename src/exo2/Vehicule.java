package exo2;

public class Vehicule {

    private boolean moteur;
    private int vitesseMax;


    public Vehicule() {
    }

    public Vehicule(boolean moteur, int vitesseMax) {
        this.moteur = moteur;
        this.vitesseMax = vitesseMax;
    }


    public boolean isMoteur() {
        return moteur;
    }

    public void setMoteur(boolean moteur) {
        this.moteur = moteur;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public void afficheVitesseMax() {
        System.out.println("vitesse max = " + vitesseMax);
    }


    @Override
    public String toString() {
        return "Vehicule{" +
                "moteur=" + moteur +
                ", vitesseMax=" + vitesseMax +
                '}';
    }
}
