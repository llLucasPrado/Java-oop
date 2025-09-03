package exe1;

import java.util.Scanner;

public class MainElevador {
    public static void main(String[] args) {

    // valores fixos
    Elevador e1 = new Elevador(10, 6);
        e1.entrar();
        e1.entrar();
        e1.subir();
        e1.subir();
        e1.sair();
        System.out.println("=== Estado final do Elevador 1 ===");
        e1.exibe();

    // valores pelo usurio
    Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o total de andares do prédio: ");
    int andares = sc.nextInt();
        System.out.print("Digite a capacidade do elevador: ");
    int capacidade = sc.nextInt();

    Elevador e2 = new Elevador(andares, capacidade);

    // limpar enter pendente
        sc.nextLine();

        System.out.println("\nDigite comandos (subir, descer, entrar, sair, parar):");
        while (true) {
        System.out.print("> ");
        String comando = sc.nextLine().toLowerCase();

        if (comando.equals("subir")) {
            e2.subir();
        } else if (comando.equals("descer")) {
            e2.descer();
        } else if (comando.equals("entrar")) {
            e2.entrar();
        } else if (comando.equals("sair")) {
            e2.sair();
        } else if (comando.equals("parar")) {
            break;
        } else {
            System.out.println("Comando inválido!");
        }
    }

        System.out.println("=== Estado final do Elevador 2 ===");
        e2.exibe();

        sc.close();
    }
}
