package exo1;

public class Rectangle {
    private Point pointSupDroit;
    private Point pointInfGauche;


    public Rectangle() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(0, 0);
        this.pointSupDroit = p1;
        this.pointInfGauche = p2;
    }

    public Rectangle(int xSupD, int ySupD, int xInfG, int yInfG) {

        this.pointSupDroit = new Point();
        this.pointInfGauche = new Point();


        this.pointSupDroit.setX(xSupD);
        this.pointSupDroit.setY(ySupD);
        this.pointInfGauche.setX(xInfG);
        this.pointInfGauche.setY(yInfG);
    }


    public Rectangle(Point pointSupDroit, Point pointInfGauche) {
        this.pointSupDroit = pointSupDroit;
        this.pointInfGauche = pointInfGauche;
    }


    public int calculeSurface() {
        return (pointSupDroit.getX() - pointInfGauche.getX()) * (pointSupDroit.getY() - pointInfGauche.getY());
    }
}
