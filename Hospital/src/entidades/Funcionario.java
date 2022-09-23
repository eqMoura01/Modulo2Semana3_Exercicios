package entidades;

public abstract class Funcionario extends Pessoa {
    private String dtAdmissao;

    public Funcionario(String nome, String genero, String dtAdmissao) {
        super(nome, genero);
        this.dtAdmissao = dtAdmissao;
    }

    public void batePonto() {
        System.out.println("O funcionario " + this.getNome() + " bateu o ponto!");
    }

}
