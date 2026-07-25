package Construtores.Celular;

public class Celular {

    // Atributos
    private String marca;
    private String modelo;
    private int memoria;
    private double preco;

    // Construtor vazio
    public Celular() {

    }

    // Construtor com parâmetros
    public Celular(String marca, String modelo, int memoria, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.preco = preco;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para mostrar os dados
    public void mostrarInformacoes() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memória: " + memoria + " GB");
        System.out.println("Preço: R$ " + preco);
        System.out.println("----------------------------");

    }

}
