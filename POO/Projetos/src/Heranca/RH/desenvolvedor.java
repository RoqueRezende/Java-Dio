package Heranca.RH;

public class desenvolvedor extends funcionario{
    private double bonificacao;
    private int projetos;

    public desenvolvedor(String nome, int registro, double salario, double bonificacao, int projetos){
        super(nome, registro, salario);
        this.bonificacao=bonificacao;
        this.projetos=projetos;
    }

    public double calcSalario(){
        return salario + (bonificacao*projetos);
    }

    public void exibirDados() {

        super.exibir();

        System.out.println("Projetos: " + projetos);
        System.out.println("Bônus por projeto: " + bonificacao);
        System.out.println("Salário Final: " + calcSalario());
    }
}