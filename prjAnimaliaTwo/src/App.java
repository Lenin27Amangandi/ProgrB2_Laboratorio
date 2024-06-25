import morthalEcosistema.CorreCaminos;
import morthalEcosistema.Leon;
import morthalEcosistema.LeonCuy;
import morthalEcosistema.Pato;

public class App {
    public static void main(String[] args) throws Exception {
        Pato p = new Pato("Donals");
        CorreCaminos co = new CorreCaminos("RunFast");
        Leon l = new Leon("Simba");
        LeonCuy lc = new LeonCuy("Clouyn");

        System.out.println(p.toString());
        System.out.println(l.toString());
        System.out.println(lc.toString());

        lc.comer(p);
        lc.comer(co);
    }
}
