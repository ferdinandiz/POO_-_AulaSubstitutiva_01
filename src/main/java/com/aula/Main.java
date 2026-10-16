package com.aula;

import com.aula.model.Pikachu;
import com.aula.model.Pokemon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokemon pkm = new Pokemon();
        Pokemon pkm2 = new Pokemon(
                "Ivysaur",
                "Planta",
                2
        );
        System.out.println("Digite o nome do Pokemon: ");
        pkm.setNome(sc.next());
        pkm.setNumero(1);
        pkm.setTipo("Planta");

        Pikachu p =  new Pikachu(
                "Pikachu",
                "Eletrico",
                "Raio do Trovao",
                21
        );

        pkm.imprimirPokemon();
        pkm2.imprimirPokemon();
        p.imprimirPokemon();

    }
}