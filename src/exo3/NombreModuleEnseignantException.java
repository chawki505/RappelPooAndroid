package exo3;

public class NombreModuleEnseignantException extends Exception {


    public NombreModuleEnseignantException() {
        System.out.println("Vous essayez d'inserer une matiere a un enseignant avec un nombre superieur a 3 !");
    }
}
