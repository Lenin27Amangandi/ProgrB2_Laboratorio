package morthalEcosistema.comportamiento;

import morthalClasificacion.Ave;
import morthalEcosistema.Pato;

public interface ICarnivoro {

    public void comer();

    public void comer(Pato alimentoPatuno);

    // Para que todo carnivoro pueda comer cualquier ave
    public void comer(Ave alimentoAvicola);

}
