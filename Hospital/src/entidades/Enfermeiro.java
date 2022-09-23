package entidades;

public class Enfermeiro extends Funcionario {

    private String coren;

    public Enfermeiro(String nome, String genero, String dtAdmissao, String coren) {
        super(nome, genero, dtAdmissao);
        this.coren = coren;
    }

    public void tratar(Paciente paciente) {
        System.out.println("O enfermeiro " + this.getNome() + " está cuidando do paciente " + paciente.getNome());
    }

}
