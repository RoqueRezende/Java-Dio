package Projetos.Metodos;

public class SmartTv {
    boolean ligada=false;
    int volume=25;
    int canal=1;
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
    }
}
