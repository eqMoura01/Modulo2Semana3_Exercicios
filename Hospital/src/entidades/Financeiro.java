package entidades;

public class Financeiro extends Funcionario {

    public Financeiro(String nome, String genero, String dtAdmissao) {
        super(nome, genero, dtAdmissao);
    }

    public void pagarSalario(Funcionario funcionario) {
        System.out.println("O contador " + this.getNome() + " pagou o salario de " + funcionario.getNome());
    }

}
