package morthalEcosistema;

import morthalClasificacion.Mamifero;
import morthalEcosistema.comportamiento.IHerbivoro;

public class Cuy extends Mamifero implements IHerbivoro {

    @Override
    public void comer(Hierva alimentoHierva) {

        System.out.println("El cuy esta comiendo hierva: " + alimentoHierva.getNombreHierva());

    }

}
