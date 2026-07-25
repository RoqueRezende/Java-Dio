package getandset.Empresa;

public class main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Roque", 3500);

        funcionario1.mostrarInformacoes();

        funcionario1.aumentarSalario(10);

        funcionario1.mostrarInformacoes();

        funcionario1.setSalario(-500);

        funcionario1.mostrarInformacoes();

        Funcionario funcionario2 = new Funcionario("Maria", 5000);

        funcionario2.mostrarInformacoes();

        funcionario2.aumentarSalario(15);

        funcionario2.mostrarInformacoes();
    }
}
