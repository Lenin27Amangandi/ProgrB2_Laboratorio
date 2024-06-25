package morthalEcosistema;

import morthalClasificacion.Ave;
import morthalEcosistema.comportamiento.IAccion1;

public class CorreCaminos extends Ave implements IAccion1 {

    // Aqui esmos colocando un nombre al correcaminos y este correcaminos le ponemos
    // el metodo setNombre viene de la herencia el ave el cual hereda de animal.
    public CorreCaminos(String nombreCorrecaminos) {
        setNombre(nombreCorrecaminos);
    }

    @Override
    public void correr() {
        System.out.println("Correcamino is running ....");
    }

    @Override
    public String toString() {
        return    "\n Clase: " + getClass().getName()
                + "\n Nombre: " + getNombre()
                + "\n Nro Alas: " + getNumeroAlas();
    }

}
