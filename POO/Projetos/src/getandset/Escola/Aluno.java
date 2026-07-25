package getandset.Escola;

public class Aluno {
    private String nome;
    private float nota;

    //getters
    public String getNome(){
        return nome;
    }

    public float getNota(){
        return nota;
    }

    //setters
    public void setNome(String nome){
        this.nome=nome;
    }

    public void setNota(float nota){
        this.nota=nota;
    }
}
