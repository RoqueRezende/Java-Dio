package Encapsulamento.CarrodeCorrida;

public class main {
    public static void main(String[] args) {

        carro carro = new carro(0, 0);

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println("Velocidade: " + carro.getVelocidade());
        System.out.println("Marcha: " + carro.getMarcha());

        carro.frear();

        System.out.println("Velocidade: " + carro.getVelocidade());
        System.out.println("Marcha: " + carro.getMarcha());

    }

}

