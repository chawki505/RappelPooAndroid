package exo2;

public class Voiture_derivee extends Vehicule {

    private int nbPorte;


    public Voiture_derivee(boolean moteur, int vitesseMax, int nbPorte) {
        super(moteur, vitesseMax);
        this.nbPorte = nbPorte;
    }

    public int getNbPorte() {
        return nbPorte;
    }

    public void setNbPorte(int nbPorte) {
        this.nbPorte = nbPorte;
    }


    @Override
    public String toString() {
        return "Voiture_derivee{" +
                "nbPorte=" + nbPorte +
                '}';
    }
}
