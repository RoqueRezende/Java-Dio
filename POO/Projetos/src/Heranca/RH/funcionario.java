package Heranca.RH;

public class funcionario {
    protected String nome;
    protected int registro;
    protected double salario;

    //Construtores
    public funcionario(String nome, int registro, double salario){
        this.nome=nome;
        this.registro=registro;
        this.salario=salario;
    }

    public double calcSalario(){
        return salario;
    }

    //Exibir
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Registro: " + registro);
        System.out.println("Salário Base: " + salario);
    }
}
