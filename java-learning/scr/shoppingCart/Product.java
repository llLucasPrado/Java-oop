package exe7;

public class Product {
    private int id;
    private String nome;
    private double preco;

    public Product(String nome, double preco, int id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
