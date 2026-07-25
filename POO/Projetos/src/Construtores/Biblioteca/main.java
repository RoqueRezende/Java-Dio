package Construtores.Biblioteca;

public class main {
    public static void main(String[] args) {

        Livros livro1 = new Livros("Java Como Programar", "Deitel", 3);

        Livros livro2 = new Livros("Clean Code", "Robert C. Martin", 1);

        livro1.mostrarEstoque();

        livro1.emprestarLivro();
        livro1.emprestarLivro();

        livro1.mostrarEstoque();

        livro1.devolverLivro();

        livro1.mostrarEstoque();

        System.out.println();

        livro2.mostrarEstoque();

        livro2.emprestarLivro();

        livro2.mostrarEstoque();

        livro2.emprestarLivro();

        livro2.mostrarEstoque();

    }

}

