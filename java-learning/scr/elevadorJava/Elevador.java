package exe1;

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int lotacao;

    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.lotacao = 0;
    }

    public void exibe() {
        System.out.println("Andar atual: " + andarAtual);
        System.out.println("Lotação: " + lotacao + "/" + capacidade);
        System.out.println("------------------------------");
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    public void entrar() {
        if (lotacao < capacidade) {
            lotacao++;
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sair() {
        if (lotacao > 0) {
            lotacao--;
        } else {
            System.out.println("Elevador vazio!");
        }
    }
}
