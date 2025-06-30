package POO;


public class Revista extends Item {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        setEdicao(edicao);
    }

    public int getEdicao() {

        return edicao;
    }

    public void setEdicao(int edicao) {
        if (edicao <= 0) {
            throw new IllegalArgumentException("Edição deve ser maior que zero.");
        }
        this.edicao = edicao;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

    @Override
    public void exibirDetalhes() {

        super.exibirDetalhes();

        System.out.printf("Edição: %d%n", edicao);
    }
}
