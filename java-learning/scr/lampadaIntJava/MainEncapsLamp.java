package exe3;
import exe3.LampEncaps;

public class MainEncapsLamp {
    public static void main(String[] args) {
        LampEncaps obj1 = new LampEncaps();
        obj1.setBrilho(50);

        LampEncaps obj2 = new LampEncaps();
        obj2.setBrilho(120);
        obj2.setLigada(true);
        obj2.setCor("Branca");
        obj2.setMarca("Philips");

        obj2.exibe();

        LampEncaps obj3 = new LampEncaps("Elgin", "Branca", true, 240);

        System.out.println("Lâmpada 1 -> Brilho: " + obj1.getBrilho());
        System.out.println("Lâmpada 2 -> Ligada: " + obj2.getLigada()
                + ", Brilho: " + obj2.getBrilho()
                + ", Cor: " + obj2.getCor()
                + ", Marca: " + obj2.getMarca());

        obj3.exibe();

    }
}
