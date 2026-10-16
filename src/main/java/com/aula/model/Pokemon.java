package com.aula.model;

public class Pokemon {
    protected String nome;
    private String tipo;
    private int numero;


    public Pokemon(String n, String tipo, int numero){
        this.nome = n;
        this.tipo = tipo;
        this.numero = numero;
    }
    public Pokemon(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void imprimirPokemon(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Numero: "+this.numero);
        System.out.println("Tipo: "+this.tipo);
    }
    public void imprimirPokemon(int a){

    }

}
