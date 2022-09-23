package entidades;

public class Livro {
    private String nome;
    private String descricao;
    private Autor autor;
    private Double valor;
    private int isbn;

    public Livro(String nome, String descricao, Autor autor, Double valor, int isbn) {
        this.nome = nome;
        this.descricao = descricao;
        this.autor = autor;
        this.valor = valor;
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Nome do livro: " + this.getNome() + "\nDescrição do livro: " + this.getDescricao()
                + "\nAutor do livro: " + this.getAutor().getNome() + "\nValor do livro: R$" + this.getValor()
                + "\nISBN: " + this.getIsbn();
    }

}
