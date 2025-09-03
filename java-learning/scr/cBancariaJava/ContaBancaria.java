package exe2;

public class ContaBancaria {
    public String titular;
    public String numero;
    public double saldo;
    public boolean ativa;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, String numero, double saldoInicial, boolean ativa) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
        this.ativa = ativa;
    }

    public void exibir() {
        String numMasc = "****" + numero.substring(numero.length() - 4);
        System.out.println("Titular: " + titular +
                "\nNúmero: " + numMasc +
                "\nSaldo: " + saldo +
                "\nAtiva: " + ativa + "\n");
    }

    public void ativar() {
        if (!this.ativa) {
            this.ativa = true;
            System.out.println("Conta ativada!");
        }
    }

    public void desativar() {
        if (this.saldo >= 0) {
            this.ativa = false;
            System.out.println("Conta desativada!");
        } else {
            System.out.println("Não é possível desativar com saldo negativo.");
        }
    }

    public void depositar(double valor) {
        if (this.ativa && valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de " + valor + " realizado!");
        } else {
            System.out.println("Depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (this.ativa && valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado!");
        } else {
            System.out.println("Saque inválido!");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (this.ativa && destino.ativa && valor > 0 && valor <= this.saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada!");
        } else {
            System.out.println("Transferência inválida!");
        }
    }
}