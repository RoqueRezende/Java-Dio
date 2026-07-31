package Encapsulamento.Empresa;

public class funcionario {
    private int registro;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String setor;
    private String telefone;
    private endereco endereco;

    //Construtor
    public funcionario(int registro, String nome, String dataNascimento, String sexo, String setor, String telefone, endereco endereco){
        this.telefone=telefone;
        this.dataNascimento=dataNascimento;
        this.nome=nome;
        this.registro=registro;
        this.sexo=sexo;
        this.endereco=endereco;
        this.setor=setor;
    }
    //getters
    public int getregistro(){
        return registro;
    }
    public String getnome(){
        return nome;
    }
    public String getdataNascimento(){
        return dataNascimento;
    }
    public String getsexo(){
        return sexo;
    }
    public String getsetor(){
        return setor;
    }
    public String gettelefone(){
        return telefone;
    }
    public endereco getendereco(){
        return endereco;
    }
    //Setter
    public void setsetor(String setor){
        this.setor=setor;
    }
    public void settelefone(String telefone){
        this.telefone=telefone;
    }
    //relatorio
    public void emitirRelatorio() {


        System.out.println("----- FUNCIONÁRIO -----");

        System.out.println("Registro: " + registro);
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Setor: " + setor);
        System.out.println("Telefone: " + telefone);


        System.out.println("\n----- ENDEREÇO -----");

        System.out.println("Rua: " + endereco.getrua());
        System.out.println("Número: " + endereco.getnumero());
        System.out.println("Bairro: " + endereco.getbairro());
        System.out.println("Cidade: " + endereco.getcidade());
        System.out.println("Estado: " + endereco.getestado());

    }

    
}