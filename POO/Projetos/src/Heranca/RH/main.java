package Heranca.RH;

public class main {
    public static void main(String[] args) {
        administrativo a = new administrativo("João",1,3000,500);
        desenvolvedor d = new desenvolvedor("Maria",2,10000,2,1500);
        gerente g = new gerente("Carlos",3,10000,500000,1);
        System.out.println("ADMINISTRATIVO");
        a.exibirDados();
        System.out.println();
        System.out.println("DESENVOLVEDOR");
        d.exibirDados();
        System.out.println();
        System.out.println("GERENTE");
        g.exibir();
    }
}
