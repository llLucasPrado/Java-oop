package exe8;
import java.util.List;
import java.util.ArrayList;

public class LibraryUser {
    private String name;
    private List <LoanItem> loans;

    public LibraryUser(String name) {
        this.name = name;
        this.loans = new ArrayList<>();
    }

    public void addLoan(Book book, int days) {
        if(loans.size() >= 5) {
            System.out.println("Sua lista já está no limite! O maximo permitido são 5 emprestimos!");
        } else {
            loans.add(new LoanItem(book, days));
            System.out.println(book + " foi adicionado a sua lista por " + days + " dias!");
        }
    }
    public void removeLoan(int id) {
        if(id >= 0 && id < loans.size()) {
            loans.remove(id);
            System.out.println("Livro na posição " + id + " foi retirado com sucesso!");
        } else {
            System.out.println("Emprestimo não encontrado!");
        }
    }
    public void clearLoans() {
        if(loans.size() > 0) {
            loans.clear();
            System.out.println("A lista de emprestimos foi redefinida!");
        } else {
            System.out.println("Não foi encontrado nenhum emprestimo em sua conta!");
        }
    }
    public boolean isEmpty() {
        if (loans.isEmpty()) {
            System.out.println("A lista de empréstimos está vazia!");
            return true;
        } else {
            System.out.println("Sua lista está com " + loans.size() + " livros em empréstimo!");
            return false;
        }
    }
    public int totalDaysBorrowed() {
        int total = 0;
        for(LoanItem loan : loans) {
            total += loan.getDays();
        }
        return total;
    }
    public void listBooks() {
        if(loans.isEmpty()) {
            System.out.println("A lista está vazia!");
        }else {
            System.out.println("Emprestimos feitos por " + name + ": ");
            for (LoanItem loan : loans) {
                System.out.println("- " +loan.getBook().getTitle());
            }
        }
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "name='" + name + '\'' +
                ", loans=" + loans +
                '}';
    }
}
