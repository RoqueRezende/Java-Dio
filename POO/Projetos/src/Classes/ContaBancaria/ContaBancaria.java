package Classes.ContaBancaria;

public class ContaBancaria {
    private int numero;
    private String titular;
    private float saldo;

    //Construtor
    public ContaBancaria(int numero, String titular, float saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    //getter
    public int getNumero(){
        return numero;
    }

    public String getTitulat(){
        return titular;
    }

    public float getSaldo(){
        return saldo;
    }
    //setter
    public void setNumero (int numero){
        this.numero=numero;
    }
    
    public void setTitular(String titular){
        this.titular=titular;
    }

    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    //Metodos
    public void depositar(float valor){
        saldo+=valor;
        System.out.println("Valor depositado, novo saldo é: " + saldo);
    }

    public void sacar(float valor){
        if (saldo>=valor) {
            saldo-=valor;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Novo saldo: "+saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo(){
        System.out.println("Titular: "+ titular);
        System.out.println("Saldo: "+ saldo);
    }
}
