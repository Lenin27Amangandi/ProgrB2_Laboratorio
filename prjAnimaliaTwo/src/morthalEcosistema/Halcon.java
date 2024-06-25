package morthalEcosistema;

import java.util.ArrayList;
import java.util.List;

import morthalClasificacion.Ave;
import morthalEcosistema.comportamiento.IAccion2;

public class Halcon extends Ave implements IAccion2 {
    // Con esto cumplimos la sociciacion y le inicializamos
    // Primera Forma
    // public List<Pato> amigoPatos = new ArrayList<Pato>();

    // Segunda Forma
    public List<Pato> amigPatos;

    public Halcon(String nombreHalcon) {
        amigPatos = new ArrayList<Pato>();
        setNombre(nombreHalcon);
    }

    @Override
    public void volar() {
        System.out.println("El Halcon esta volando ....");
    }

    @Override
    public String toString() {
        return "\n Clase: " + getClass().getName()
                + "\n Nombre: " + getNombre()
                + "\n Nro Alas: " + getNumeroAlas();
    }

}
