package animalEcosistema;

import java.util.ArrayList;
import java.util.List;

import animalClasificacion.Ave;
import animalEcosistema.comportamiento.IAccion2;

public class Halcon extends Ave implements IAccion2 {

    public List<Pato> amigPatos;

    public Halcon(String nombre) {
        setNombre(nombre);

        amigPatos = new ArrayList<Pato>();

    }

    @Override
    public void volar() {
        System.out.println("This Halcon is flaying ........");
    }

    @Override
    public String toString() {
        return "\n nombre " + getNombre()
                + "\n NroAlas " + getNroAlas()
                + "\n Clase " + getClass().getName();
    }

}
