package POO;


public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1       = new Livro("A Erva do Diabo", "Carlos Castañeda", 1968);
        Livro livro2       = new Livro("Clean Code", "Robert C. Martin", 2008);
        Revista revista1   = new Revista("Caras", "Various", 1997, 7825);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(revista1);

        System.out.println("=== Todos os itens da biblioteca ===");
        biblioteca.listarItens();

        System.out.println("\n=== Busca de um livro específico ===");
        Livro buscado = biblioteca.buscarLivroPorTitulo("A Erva do Diabo");
        if (buscado != null) {
            buscado.exibirDetalhes();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
