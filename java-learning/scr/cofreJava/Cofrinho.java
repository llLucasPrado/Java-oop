package exe4;

public class Cofrinho {
    private double saldo;
    private boolean fechado;

    public Cofrinho(){
    this.setSaldo(0);
    this.setFechado(false);
    }
    public Cofrinho(double saldo, boolean fechado){
        this.setSaldo(saldo);
        this.setFechado(fechado);
    }

    //setters
    public void setSaldo(double saldo){
        if(!this.fechado && this.saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Cofrinho fechado ou saldo negativo");;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public void abrir(){
        if(this.fechado){
            this.setFechado(false);
        }
        else System.out.println("O cofrinho já está aberto");
    }

    public void fechar(){
        if(!this.fechado){
            this.setFechado(true);
        }
        else System.out.println("O cofrinho já está fechado");
    }


    //getters
    public double getSaldo(){
        return this.saldo;
    }
    public boolean getFechado(){
        return this.fechado;
    }

    //metodos
    public void depositar(double valor){
        if(valor > 0 && !this.fechado){
            this.setSaldo(this.saldo + valor);
        }
    }

    public void retirarTudo(){
        if(!this.fechado){
            System.out.println("Valor retirado " + this.saldo);
            this.saldo = 0;
        }
    }

    public void exibirSaldo(){
        if(!this.fechado){
            System.out.println("Saldo: " + this.saldo);
        }
        else System.out.println("Cofrinho fechado, saldo indisponivel");
    }
}
