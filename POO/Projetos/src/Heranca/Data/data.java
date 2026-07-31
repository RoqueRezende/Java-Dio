package Heranca.Data;
public class data {

    protected int dia;
    protected int mes;
    protected int ano;

    public data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public data(int mes, int ano){
        this(1, mes, ano);
    }

    public data(int dia){
        this(dia,1,2000);
    }

    public data(){
        this(1,1,2000);
    }

    public String exibirData(){

        return dia + "/" + mes + "/" + ano;

    }

}