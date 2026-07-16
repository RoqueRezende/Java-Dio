package Projetos.Metodos;

public class usuario {
    public usuario() {
    }

    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);
        
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);
    }
}