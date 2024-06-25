package morthalEcosistema;

import morthalClasificacion.Ave;
import morthalClasificacion.Mamifero;
import morthalEcosistema.comportamiento.IAccion1;
import morthalEcosistema.comportamiento.ICarnivoro;

public class Leon extends Mamifero implements IAccion1, ICarnivoro {
    public Pato alimentoPatuno;

    public Leon(String nombre) {
        setNombre(nombre);
        alimentoPatuno = new Pato("Drux");
    }

    @Override
    public void correr() {
        System.out.println("Leon esta corriendo ");
    }

    @Override
    public void comer() {
        System.out.println("Leon esta comiendo hambre ... ");
    }

    @Override
    public void comer(Pato alimentoPatuno) {
        System.out.println("Leon esta comiendo un pato:  " + alimentoPatuno.toString());
    }

    @Override
    public void comer(Ave alimentoAvicola) {
        System.out.println("LeonCuy come Ave: " + alimentoAvicola.getNombre());
    }

    @Override
    public String toString() {
        return "\n Clase: " + getClass().getName()
                + "\n Nombre: " + getNombre();
    }

}
