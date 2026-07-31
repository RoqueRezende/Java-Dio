package Heranca.Data;
public class feriado extends data{
    private String descricao;
    public feriado(){
        super();
        descricao = "Feriado";
    }
    public feriado(String descricao){
        super();
        this.descricao = descricao;
    }
    public feriado(int dia,int mes,int ano,String descricao){
        super(dia,mes,ano);
        this.descricao = descricao;
    }
    public String exibirData(){
        return super.exibirData() + " - " + descricao;
    }
}

