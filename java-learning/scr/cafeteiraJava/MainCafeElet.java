package exe5;
import exe5.CafeElet;

public class MainCafeElet {
    public static void main(String[] args) {

        CafeElet c = new CafeElet();
        c.setLigada(true);
        c.setAgua(300);
        c.setCafe(30);

        c.prepararCafe();  // 1º
        c.prepararCafe();  // 2º
        c.prepararCafe();  // 3º

        c.adicionarAgua(2000);
        c.adicionarCafe(100);

        c.prepararCafe();   // 1ª
        c.prepararCafe();   // 2ª
        c.prepararCafe();   // 3ª
        c.prepararCafe();   // 4ª

        CafeElet c2 = new CafeElet(150, 50, false);
        c2.prepararCafe();
        c2.adicionarAgua(2000);
        c2.adicionarCafe(100);
    }
}