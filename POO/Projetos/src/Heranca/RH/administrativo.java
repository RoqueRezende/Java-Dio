package Heranca.RH;

public class administrativo extends funcionario{
    private double adicional;
    public administrativo(String nome, int registro, double salario, double adicional){
        super(nome, registro, salario);
        this.adicional=adicional;
    }

    public double calcSalario(){
        return salario + adicional;
    }

    public void exibirDados() {

        super.exibir();

        System.out.println("Adicional: " + adicional);
        System.out.println("Salário Final: " + calcSalario());
    }
}
