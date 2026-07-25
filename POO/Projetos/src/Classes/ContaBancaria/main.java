package Classes.ContaBancaria;

public class main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(011, "Roque", 1763);
        
        conta.consultarSaldo();

        System.out.println();

        conta.depositar(500);

        conta.consultarSaldo();

        System.out.println();

        conta.sacar(300);

        conta.consultarSaldo();

        System.out.println();

        conta.sacar(2000);

        conta.consultarSaldo();
    }
}
