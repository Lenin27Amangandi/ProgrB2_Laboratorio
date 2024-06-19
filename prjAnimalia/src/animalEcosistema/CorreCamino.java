package animalEcosistema;

import animalClasificacion.Ave;
import animalEcosistema.comportamiento.IAccion1;

public class CorreCamino extends Ave implements IAccion1 {

    public CorreCamino(String nombre) {
        setNombre(nombre);
    }

    @Override
    public void corre() {
        System.out.println("CorreCaminos is running .......");
    }

    @Override
    public String toString() {
        return "\n nombre " + getNombre() 
                + "\n NroAlas " + getNroAlas() 
                + "\n Clase " + getClass().getName();
    }

}
