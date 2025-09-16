package exe5;

public class CafeElet {
    private int agua, poCafe;
    private boolean ligada;

    public CafeElet(){

    }

    public CafeElet(int agua, int poCafe, boolean ligada){
        this.setAgua(agua);
        this.setCafe(poCafe);
        this.setLigada(ligada);
    }

    //setters
    public void setAgua(int agua){
        if(agua <= 2000 && agua >= 0){
            this.agua = agua;
        }
        else System.out.println("Agua menor que o limite ou maior que 2000ml");
    }
    public void setCafe(int poCafe){
        if(poCafe <= 100 && poCafe >= 0){
            this.poCafe = poCafe;
        }
        else System.out.println("Pó de café menor que a quantidade permitida ou limite está excedido");
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }

    //getters
    public int getAgua(){
        return this.agua;
    }
    public int getpoCafe(){
        return this.poCafe;
    }
    public boolean getLigada(){
        return this.ligada;
    }

    //metodos
    public void ligar(){
        if(!this.ligada){
            this.setLigada(true);
            System.out.println("Cafeteira ligada!");
        }
        else System.out.println("Já está ligada!");
    }
    public void desligar(){
        if(this.ligada){
            this.setLigada(false);
            System.out.println("Cafeteira desligada!");
        }
        else System.out.println("Já está desligada!");
    }
    public void adicionarAgua(int ml){
        if(ml <= 0){
            System.out.println("Quantidade invalida, informe um valor positivo!");
        }
        else if(this.agua + ml <= 2000){
            this.agua += ml;
            System.out.println("Adicionado " + ml +"ml, total atual: " + this.agua + "ml");
        }
        else System.out.println("Quantidade informada ultrapassa os limites de 2000ml da cafeteira!");
    }
    public void adicionarCafe(int gramas){
        if(gramas <= 0){
            System.out.println("Quantidaded invalida, informe um valor positivo!");
        }
        else if(this.poCafe + gramas <= 100){
            this.poCafe += gramas;
            System.out.println("Adicionado " + gramas +"gramas, total atual: " + this.poCafe + "gramas");
        }
        else System.out.println("Quantidade informada ultrapassa os limites de 100g da cafeteira!");
    }
    public void prepararCafe(){
        if(this.ligada && this.agua >= 100 && this.poCafe >= 10){
            this.agua -= 100;
            this.poCafe -= 10;
            System.out.println("Café preparado!");
            this.quantosCafesPossiveis();
        }
        else System.out.println("Recursos insuficientes para fazer café ou a cafeteira está desligada: " +
        "\n Ligada: " + this.ligada +
        "\n Agua: " + this.agua +
        "\n Pó de café: " + this.poCafe);
    }
    public void quantosCafesPossiveis(){
        int cafesPorAgua = this.agua/100;
        int cafesPorCafe = this.poCafe/10;
        int qtd = Math.min(cafesPorAgua, cafesPorCafe);

        System.out.println("Ainda é possivel preparar " + qtd + " cafés");
    }
}
