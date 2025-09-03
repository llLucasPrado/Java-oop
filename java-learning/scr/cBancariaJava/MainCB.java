package exe2;

public class MainCB {
    public static void main(String[] args) {

        // constructor vazio
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "João";
        conta1.numero = "12345678";
        conta1.saldo = 500;
        conta1.ativa = true;

        // constructor completo
        ContaBancaria conta2 = new ContaBancaria("Maria", "87654321", 1000, true);

        System.out.println("=== Estado inicial ===");
        conta1.exibir();
        conta2.exibir();

        conta1.depositar(200);     // deposito na conta1
        conta2.sacar(150);         // sacar 150 na conta2
        conta1.transferir(conta2, 300); // transferencia de 300

        System.out.println("\n=== Estado final ===");
        conta1.exibir();
        conta2.exibir();
    }
}
