package morthalEcosistema;

import morthalClasificacion.Ave;
import morthalEcosistema.comportamiento.IHerbivoro;

public class LeonCuy extends Leon implements IHerbivoro {

    public LeonCuy(String nombreLeonCuy) {
        super("Leon");
        setNombre(nombreLeonCuy);
    }

    @Override
    public void comer(Pato alimentoPatuno) {
        System.out.println("LeonCuy come: " + alimentoPatuno.getNombre());
    }

    @Override
    public void comer() {
        System.out.println("Leon Cuy come hambre ");
    }

    @Override
    public void comer(Hierva alimentoHierva) {
        System.out.println("LeonCuy come: " + alimentoHierva.getNombreHierva());
    }

    @Override
    public void comer(Ave alimentoAvicola) {
        System.out.println("LeonCuy come Ave: " + alimentoAvicola.getNombre());

    }

}
