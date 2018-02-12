package exo2;

public class Voiture_Composee {

    private Vehicule vehicule;
    private int nbPorte;


    public Voiture_Composee(boolean moteur, int vitesseMax, int nbPorte) {
        this.vehicule = new Vehicule();

        this.vehicule.setMoteur(moteur);
        this.vehicule.setVitesseMax(vitesseMax);

        this.nbPorte = nbPorte;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public int getNbPorte() {
        return nbPorte;
    }

    public void setNbPorte(int nbPorte) {
        this.nbPorte = nbPorte;
    }


    public void afficheVitesseMax() {
        System.out.println("vitesse max = " + vehicule.getVitesseMax());
    }

    @Override
    public String toString() {
        return "Voiture_Composee{" +
                "vehicule=" + vehicule +
                ", nbPorte=" + nbPorte +
                '}';
    }
}
