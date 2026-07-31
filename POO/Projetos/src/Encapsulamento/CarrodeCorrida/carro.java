package Encapsulamento.CarrodeCorrida;

public class carro {
    private int marcha;
    private int velocidade;

    //construtores
    public carro(int marcha, int velocidade){
        this.marcha=0;
        this.velocidade=0;
    }

    //getters
    public int getMarcha(){
        return marcha;
    }
    public int getVelocidade(){
        return velocidade;
    }

    public void acelerar(){
        if (velocidade<130) {
            velocidade += 5;
            atualizarMarcha();
        }
    }
    public void frear(){
        if(velocidade>0){
            velocidade-=5;
            atualizarMarcha();
        }
    }

    public void atualizarMarcha(){
        if (velocidade==0) {
            marcha=0;
        }
        else if (velocidade<=19) {
            marcha=1;
        }
        else if (velocidade<=39) {
            marcha=2;
        }
        else if (velocidade<=59) {
            marcha=3;
        }
        else if (velocidade<=89) {
            marcha=4;
        }
        else{
            marcha=5;
        }
    }
}
