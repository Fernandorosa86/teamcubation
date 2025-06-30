package POO;


public abstract class Item implements ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Item(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        setAnoPublicacao(anoPublicacao);
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public int getAnoPublicacao() {

        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao < 0) {
            throw new IllegalArgumentException("Ano de publicação não pode ser negativo.");
        }
        this.anoPublicacao = anoPublicacao;
    }


    public abstract String getTipo();

    @Override
    public void exibirDetalhes() {
        System.out.printf(
                "%s — Título: %s, Autor: %s, Ano: %d%n",
                getTipo(), titulo, autor, anoPublicacao
        );
    }
}
