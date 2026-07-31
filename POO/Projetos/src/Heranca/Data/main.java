package Heranca.Data;

public class main {
    public static void main(String[] args) {
        data d1 = new data(20,7,2026);
        data d2 = new data(12,2025);
        data d3 = new data(18);
        data d4 = new data();

        System.out.println(d1.exibirData());
        System.out.println(d2.exibirData());
        System.out.println(d3.exibirData());
        System.out.println(d4.exibirData());



        feriado f1 = new feriado();

        feriado f2 = new feriado("Natal");

        feriado f3 = new feriado(25,12,2026,"Natal");

        System.out.println(f1.exibirData());
        System.out.println(f2.exibirData());
        System.out.println(f3.exibirData());

    }
}
