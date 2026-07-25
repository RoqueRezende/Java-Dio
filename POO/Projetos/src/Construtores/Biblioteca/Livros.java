package Construtores.Biblioteca;

public class Livros {
    private String titulo;
    private String autor;
    private int quantidade;

    //Construtor
    public Livros(String titulo, String autor, int quantidade){
        
        this.titulo=titulo;
        this.autor=autor;

        if (quantidade>=0) {
            this.quantidade=quantidade;
        }
        else{
            this.quantidade=0;
            System.out.println("Quantidade invalida, nenhuma quantidade adicionada");
        }
    }

    //getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getQuantidade(){
        return quantidade;
    }

    //setters

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setQuantidade(int quantidade){
        if (quantidade>=0) {
            this.quantidade=quantidade;
        }
        else{
            System.out.println("Quantidade invalida.");
        }
    }

    //Metodos

     public void emprestarLivro() {

        if (quantidade > 0) {

            quantidade--;

            System.out.println("Livro emprestado com sucesso!");

        } else {

            System.out.println("Não há exemplares disponíveis.");

        }

    }

    public void devolverLivro() {

        quantidade++;

        System.out.println("Livro devolvido com sucesso!");

    }

    public void mostrarEstoque() {

        System.out.println("----------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor : " + autor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("----------------------------");

    }
}
