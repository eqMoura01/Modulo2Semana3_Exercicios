package entidades;

import java.util.ArrayList;

public class Box {

    private String nome;
    private Double valorTotal = 0d;
    private Double desconto = 0d;
    private Double valorLiquido = 0d;
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    // Construtor...
    public Box(String nome, Double desconto) {
        this.nome = nome;
        this.desconto = desconto;
    }

    // Adiciona um Livro a lista de Livros...
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        valorTotal += livro.getValor();
    }

    // Adiciona o Ebook convertido para Livro na lista Livros...
    public void adicionaEbook(Ebook ebook) {
        Livro l1 = converteEbook(ebook);
        adicionarLivro(l1);
    }

    // Converte um Ebook para um livro...
    public Livro converteEbook(Ebook ebook) {
        Livro ebookConvertido = new Livro(ebook.getNome(), ebook.getDescricao(), ebook.getAutor(), ebook.getValor(),
                ebook.getIsbn());

        return ebookConvertido;
    }

    public void darDesconto(Double desconto) {
        this.desconto = desconto;
        valorLiquido = valorTotal - (valorTotal * (this.desconto / 100));
    }

    @Override
    public String toString() {
        return "Nome do Box: " + nome + "\nValor total: " + valorTotal + "\nValor Liquido (com desconto): "
                + valorLiquido;
    }

}
