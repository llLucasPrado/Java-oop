package exe7;

public class CartItem {
    private int id;
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity, int id) {
        this.product = product;
        this.quantity = quantity;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public double getTotal() {
        return product.getPreco() * quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
