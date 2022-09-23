import entidades.Autor;
import entidades.Box;
import entidades.Ebook;
import entidades.Livro;

public class App {
    public static void main(String[] args) throws Exception {

        // Cria objetos da classe Autor...
        Autor a1 = new Autor("Dan Brown", "danbrown@algumacoisa.com");
        Autor a2 = new Autor("Dan Red", "danred@algumacoisa.com");
        Autor a3 = new Autor("Dan Blue", "danblue@algumacoisa.com");

        // Cria objetos da classe Livro...
        Livro l1 = new Livro("O codigo da Vinci", "Um simbologista muito louco em Paris", a1, 19.90d, 51);
        Livro l2 = new Livro("O codigo da Trinti", "Um simbologista muito louco em Floripa", a2, 29.90d, 52);
        Livro l3 = new Livro("O codigo da Quarenti", "Um simbologista muito louco na Palhoça", a3, 39.90d, 53);

        // Cria objetos da classe Ebook...
        Ebook e1 = new Ebook(l1.getNome(), l1.getDescricao(), l1.getAutor(), l1.getValor(), l1.getIsbn());
        Ebook e2 = new Ebook(l2.getNome(), l2.getDescricao(), l2.getAutor(), l2.getValor(), l2.getIsbn());
        Ebook e3 = new Ebook(l3.getNome(), l3.getDescricao(), l3.getAutor(), l3.getValor(), l3.getIsbn());

        // Teste dos metodos da classe Ebook...
        e1.darDesconto(50d);
        e2.darDesconto(15d);
        e3.darDesconto(20d);

        // Cria um objeto da classe Ebook...
        Box b1 = new Box("Box 01", 15d);

        // Adiciona objeto da classe Livro na lista Livros...
        b1.adicionarLivro(l1);
        b1.adicionarLivro(l2);
        b1.adicionarLivro(l3);

        // Adiciona objeto Ebook na lista Livros após fazer a conversão dentro do
        // metodo...
        b1.adicionaEbook(e1);
        b1.adicionaEbook(e2);
        b1.adicionaEbook(e3);

        // Aplica desconto no objeto B1 da classe Box...
        b1.darDesconto(15d);

        // Exibe o que foi solicitado no exercicio...
        System.out.println(b1.toString());

    }
}
