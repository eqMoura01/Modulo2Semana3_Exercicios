package entidades;

public class Paciente extends Pessoa {

    private String dtInternacao;

    public Paciente(String nome, String genero, String dtInternacao) {
        super(nome, genero);
        this.dtInternacao = dtInternacao;
    }

    public void consumirMedicacao(Paciente paciente) {
        System.out.println("O paciente " + paciente.getNome() + " está tomando remédio");
    }

}
