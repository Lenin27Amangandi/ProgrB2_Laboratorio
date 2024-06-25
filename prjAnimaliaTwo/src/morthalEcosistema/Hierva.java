package morthalEcosistema;

public class Hierva {

    private String nombreHierva;

    public Hierva() {
        nombreHierva = "Alfalfa";
    }

    public String getNombreHierva() {
        return nombreHierva.toLowerCase();
    }

    @Override
    public String toString() {
        return "\n Clase: " + getClass().getName()
                + "\n Nombre: " + getNombreHierva();
    }
}
