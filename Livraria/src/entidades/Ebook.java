package entidades;

public class Ebook extends Livro {

    public Ebook(String nome, String descricao, Autor autor, Double valor, int isbn) {
        super(nome, descricao, autor, valor, isbn);
    }

    public void darDesconto(Double desconto) {
        this.setValor(this.getValor() - (this.getValor() * (desconto / 100)));
        System.out.println("Valor do Ebook " + this.getNome() + " com desconto: " + this.getValor());
    }

}
