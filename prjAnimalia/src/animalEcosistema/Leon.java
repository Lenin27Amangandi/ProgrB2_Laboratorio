package animalEcosistema;

import animalClasificacion.Mamifero;
import animalEcosistema.comportamiento.IAccion1;
import animalEcosistema.comportamiento.IAccionCarnicora;

public class Leon extends Mamifero implements IAccion1, IAccionCarnicora {

    public Pato alimenPato;

    public Leon(String nombre) {
        setNombre(nombre);
        alimenPato = new Pato("Lucas");
    }

    @Override
    public String toString() {
        return "\n nombre " + getNombre()
                + "\n Clase " + getClass().getName();
    }

    @Override
    public void corre() {
        System.out.println("The lion corre ....");
    }

    @Override
    public void comer() {
        System.out.println("Leon come hambre");
    }

    @Override
    public void comer(Pato alimentoPatudo) {
        System.out.println("The lion come the duck: " + alimentoPatudo.toString());
    }

}
