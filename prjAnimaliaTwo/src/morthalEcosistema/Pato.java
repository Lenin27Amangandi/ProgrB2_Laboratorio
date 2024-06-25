package morthalEcosistema;

import morthalClasificacion.Ave;
import morthalEcosistema.comportamiento.IAccion1;
import morthalEcosistema.comportamiento.IAccion2;
import morthalEcosistema.comportamiento.IAccion3;

public class Pato extends Ave implements IAccion1, IAccion2, IAccion3 {

    public Halcon amiHalcon;

    public Pato(String nombrePato) {
        setNombre(nombrePato);
        amiHalcon = new Halcon("Firon");
    }

    @Override
    public void correr() {
        System.out.println("Pato esta corriendo ...");
    }

    @Override
    public void volar() {
        System.out.println("Pato esta volando ...");
    }

    @Override
    public void nadar() {
        System.out.println("Pato esta nadando ...");
    }

    @Override
    public String toString() {
        return "\n Clase: " + getClass().getName()
                + "\n Nombre: " + getNombre()
                + "\n Nro Alas: " + getNumeroAlas();
    }

}
