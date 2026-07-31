package Heranca.RH;

public class gerente extends funcionario{
    
    private double lucroEmpresa;
    private double percentual;

    public gerente(String nome, int registro, double salario, double lucroEmpresa, double percentual) {
        super(nome, registro, salario);
        this.lucroEmpresa = lucroEmpresa;
        this.percentual = percentual;
    }
    public double calcularSalario() {
        return salario + (lucroEmpresa * percentual / 100);
    }
    public void exibir() {
        super.exibir();
        System.out.println("Lucro da empresa: " + lucroEmpresa);
        System.out.println("Percentual: " + percentual + "%");
        System.out.println("Salário Final: " + calcularSalario());
    }

}
