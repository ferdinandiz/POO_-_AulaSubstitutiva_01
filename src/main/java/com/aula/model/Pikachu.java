package com.aula.model;

public class Pikachu extends Pokemon {
    private String golpe;

    public Pikachu(String nome, String tipo, String golpe, int numero){
        this.nome = nome;
        this.golpe = golpe;
        setNumero(numero);
        setTipo(tipo);
    }

    public String getGolpe() {
        return golpe;
    }

    public void setGolpe(String golpe) {
        this.golpe = golpe;
    }

    @Override
    public void imprimirPokemon() {
        super.imprimirPokemon();
        System.out.println("Golpe: "+golpe);
    }
}
