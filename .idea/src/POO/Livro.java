package POO;


public class Livro extends Item {
    public Livro(String titulo, String autor, int anoPublicacao) {

        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String getTipo() {
        return "Livro";
    }
}
