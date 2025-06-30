package POO;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Item> itens = new ArrayList<>();


    public void adicionarItem(Item item) {

        itens.add(item);
    }


    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Biblioteca vazia.");
            return;
        }
        for (Item item : itens) {
            item.exibirDetalhes();
        }
    }


    public Livro buscarLivroPorTitulo(String titulo) {
        for (Item item : itens) {
            if (item instanceof Livro
                    && item.getTitulo().equalsIgnoreCase(titulo)) {
                return (Livro) item;
            }
        }
        return null;
    }
}
