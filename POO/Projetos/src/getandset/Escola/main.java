package getandset.Escola;

public class main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Roque");
        aluno.setNota(9);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
    }
}
