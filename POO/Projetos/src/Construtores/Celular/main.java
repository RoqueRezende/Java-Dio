package Construtores.Celular;

public class main {

    public static void main(String[] args) {

        Celular celular1 = new Celular();

        celular1.setMarca("Samsung");
        celular1.setModelo("Galaxy S24");
        celular1.setMemoria(256);
        celular1.setPreco(4200.00);

        // Utilizando o construtor com parâmetros
        Celular celular2 = new Celular("Apple", "iPhone 16", 512, 8900.00);

        System.out.println("CELULAR 1");
        celular1.mostrarInformacoes();

        System.out.println("CELULAR 2");
        celular2.mostrarInformacoes();

    }

}
