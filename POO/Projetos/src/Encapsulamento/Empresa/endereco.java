package Encapsulamento.Empresa;

public class endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    //Construtor
    public endereco (String rua, int numero, String bairro, String cidade, String estado){
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado=estado;
        this.numero=numero;
        this.rua=rua;
    }
    //getters
    public String getrua(){
        return rua;
    }
    public int getnumero(){
        return numero;
    }
    public String getbairro(){
        return bairro;
    }
    public String getcidade(){
        return cidade;
    }
    public String getestado(){
        return estado;
    }
}
