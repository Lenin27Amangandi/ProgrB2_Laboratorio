import animalEcosistema.Leon;
import animalEcosistema.Pato;

public class App {
    public static void main(String[] args) throws Exception {
        Pato p = new Pato("Driam");
        Leon l = new Leon("Suma");

        System.out.println(p.toString());
        System.out.println(l.toString());

    }
}
