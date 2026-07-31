package Encapsulamento.Empresa;
public class main {
    public static void main(String[] args) {
        // Criando um endereço
        endereco endereco1 = new endereco(
                "Rua das Flores",
                100,
                "Centro",
                "Curitiba",
                "PR"
        );
        // Criando um funcionário
        funcionario funcionario1 = new funcionario(
                123,
                "João Silva",
                "10/05/2005",
                "Masculino",
                "TI",
                "99999-9999",
                endereco1
        );
        // Alterando dados permitidos
        funcionario1.setsetor("Desenvolvimento");
        funcionario1.settelefone("88888-8888");
        // Mostrando relatório
        funcionario1.emitirRelatorio();

    }
}

