package getandset.Empresa;

public class Funcionario {
    private String nome;
    private double salario;

    //Construtores
    public Funcionario(String nome, double salario){
        this.nome=nome;

        if (salario>=0) {
            this.salario=salario;
        }
        else{
            this.salario=0;
            System.out.println("Salário inválido. Salário definido como R$ 0,00.");
        }
    }

    //getters
    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    //setters
    public void setNome(String nome){
        this.nome=nome;
    }

    public void setSalario(double salario){
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido.");
        }
    }

    // Método para aumentar salário
    public void aumentarSalario(double porcentagem) {

        if (porcentagem > 0) {

            salario += salario * (porcentagem / 100);

            System.out.println("Salário atualizado com sucesso!");

        } else {

            System.out.println("Porcentagem inválida.");

        }

    }

    // Método para mostrar informações
    public void mostrarInformacoes() {

        System.out.println("----------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("----------------------------");
    }
}