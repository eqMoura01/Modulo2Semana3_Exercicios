import entidades.Enfermeiro;
import entidades.Financeiro;
import entidades.Medico;
import entidades.Paciente;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hello world!");

        Paciente p1 = new Paciente("oskr", "Msc", "01/01/2001");

        Medico m1 = new Medico("Victor", "Masc", "27/03/2001", "0001");

        Enfermeiro e1 = new Enfermeiro("Carioca", "Masc", "25/07/2022", "6969");

        Financeiro f1 = new Financeiro("Vinizin", "Masc", "01/07/2022");

        // Teste dos metodos da classe Medico
        m1.batePonto();
        m1.consultar(p1);
        m1.receitar(p1);
        m1.operar(p1);

        // Teste dos metodos da classe Enfermeiro
        e1.batePonto();
        e1.tratar(p1);

        // Teste dos metodos da classe Financeiro
        f1.batePonto();
        f1.pagarSalario(m1);
        f1.pagarSalario(e1);

    }
}
