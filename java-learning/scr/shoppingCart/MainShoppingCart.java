package exe7;

public class MainShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 3500.00, 001);
        Product p2 = new Product("Mouse", 100.00, 011);
        Product p3 = new Product("Teclado", 200.00, 111);

        ShoppingCart cart = new ShoppingCart(10); // carrinho com capacidade para 10 itens

        cart.addProduct(p1, 1, 001);
        cart.addProduct(p2, 2, 011);
        cart.addProduct(p3, 1, 111);

        System.out.println("Carrinho inicial:");
        cart.showCart();

        System.out.println("\nRemovendo Mouse do carrinho...");
        cart.removeProduct(p2);

        cart.showCart();

        System.out.println(p2); // mouse fora do carrinho
    }
}
