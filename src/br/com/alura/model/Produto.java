package br.com.alura.model;

public class Produto {

    private String nome;
    private double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return " Nome:"+ nome +"\nPreco"+preco+"\n";
    }

}
