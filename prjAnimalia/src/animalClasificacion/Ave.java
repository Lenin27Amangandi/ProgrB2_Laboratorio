package animalClasificacion;

public abstract class Ave extends Animal {

    private int nroAlas;

    public Ave() {
        nroAlas = 2;
    }

    public int getNroAlas() {
        System.out.println("Tienes " + nroAlas + " alas");
        return nroAlas;
    }

}
