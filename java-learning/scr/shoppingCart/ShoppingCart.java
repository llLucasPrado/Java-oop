package exe7;

public class ShoppingCart {
    private CartItem[] items;
    private int count; // quantidade atual de itens

    public ShoppingCart(int size) {
        items = new CartItem[size]; // tamanho fixo do carrinho
        count = 0;
    }

    public void addProduct(Product product, int quantity, int id) {
        // verifica se o produto ja existe no carrinho
        for (int i = 0; i < count; i++) {
            if (items[i].getProduct() == product) {
                items[i].addQuantity(quantity);
                return;
            }
        }
        if (count < items.length) {
            items[count] = new CartItem(product, quantity, id);
            count++;
        } else {
            System.out.println("Carrinho cheio!");
        }
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < count; i++) {
            if (items[i].getProduct() == product) {
                // empurra os elementos para tras
                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getTotal();
        }
        return total;
    }

    public void showCart() {
        if (count == 0) {
            System.out.println("Carrinho vazio.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(items[i]);
            }
            System.out.println("Total: R$ " + getTotal());
        }
    }
}
