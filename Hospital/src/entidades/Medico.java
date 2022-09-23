package entidades;

public class Medico extends Funcionario {

    private String nCrm;

    public Medico(String nome, String genero, String dtAdmissao, String nCrm) {
        super(nome, genero, dtAdmissao);
        this.nCrm = nCrm;
    }

    public void consultar(Paciente paciente) {
        System.out.println("O médico " + this.getNome() + " está consultando o paciente " + paciente.getNome());
    }

    public void receitar(Paciente paciente) {
        System.out
                .println("O médico " + this.getNome() + " está receitando para a calvicie do paciente " + paciente.getNome());
    }

    public void operar(Paciente paciente) {
        System.out.println(
                "O médico " + this.getNome() + " está fazendo transplante capilar no paciente " + paciente.getNome());
    }
}
