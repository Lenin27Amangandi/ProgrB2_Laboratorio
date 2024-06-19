package animalEcosistema;

import animalClasificacion.Ave;
import animalEcosistema.comportamiento.IAccion1;
import animalEcosistema.comportamiento.IAccion2;
import animalEcosistema.comportamiento.IAccion3;

public class Pato extends Ave implements IAccion1, IAccion2, IAccion3 {

    public Halcon amigoHalcon;

    public Pato(String nombre) {
        setNombre(nombre);
        amigoHalcon = new Halcon("Firon");
    }

    @Override
    public String toString() {
        return "\n nombre " + getNombre()
                + "\n NroAlas " + getNroAlas()
                + "\n Clase " + getClass().getName();
    }

    @Override
    public void corre() {
        System.out.println(" Duck is running .... ");

    }

    @Override
    public void volar() {
        System.out.println(" Duck is flying .... ");

    }

    @Override
    public void nadar() {
        System.out.println(" Duck is swimming .... ");

    }

}
