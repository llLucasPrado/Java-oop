package exe8;

public class MainLibrary {
    public static void main(String[] args) {
        // criando livros
        Book b1 = new Book("1984", "George Orwell", 1949);
        Book b2 = new Book("Dom Casmurro", "Machado de Assis", 1899);
        Book b3 = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Book b4 = new Book("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Book b5 = new Book("A Revolução dos Bichos", "George Orwell", 1945);
        Book b6 = new Book("Moby Dick", "Herman Melville", 1851);

        LibraryUser user = new LibraryUser("Lucas");

        // emprestimos
        user.addLoan(b1, 10);
        user.addLoan(b2, 5);
        user.addLoan(b3, 15);
        user.addLoan(b4, 7);
        user.addLoan(b5, 12);
        user.addLoan(b6, 20); // teste de livro a mais

        System.out.println("\n--- Lista de empréstimos ---");
        System.out.println(user);

        user.removeLoan(1);

        System.out.println(user);

        // total de dias
        System.out.println("\nTotal de dias emprestados: " + user.totalDaysBorrowed());

        // lista de titulos
        System.out.println("\n--- Apenas os títulos ---");
        user.listBooks();

        user.clearLoans();

        System.out.println("\n--- Após limpar todos ---");
        user.isEmpty();

    }
}