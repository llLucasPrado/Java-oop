package exe4;
import exe4.Cofrinho;

public class MainCofrinho {
    public static void main(String[] args) {

        Cofrinho c1 = new Cofrinho();
        System.out.println("Criado cofrinho c1");
        c1.exibirSaldo();

        Cofrinho c2 = new Cofrinho(50, false);
        System.out.println("\nCriado cofrinho c2 com saldo inicial");
        c2.exibirSaldo();

        // depositando no c1
        System.out.println("\nDepositando 30 no c1...");
        c1.depositar(30);
        c1.exibirSaldo();

        // fechando c1 e depositando
        System.out.println("\nFechando c1...");
        c1.fechar();
        c1.depositar(20); // não deve funcionar
        c1.exibirSaldo();

        // abrindo c1 e depositando
        System.out.println("\nAbrindo c1...");
        c1.abrir();
        c1.depositar(20);
        c1.exibirSaldo();

        // retirando c1
        System.out.println("\nRetirando tudo do c1...");
        c1.retirarTudo();
        c1.exibirSaldo();

        // teste cofre fechado
        System.out.println("\nFechando c2...");
        c2.fechar();
        c2.fechar();

        // teste cofre aberto
        System.out.println("\nAbrindo c2...");
        c2.abrir();
        c2.abrir();
    }
}