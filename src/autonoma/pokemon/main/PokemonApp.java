/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.main;

import autonoma.pokemon.models.Bulbasaur;
import autonoma.pokemon.models.Charmander;
import autonoma.pokemon.models.Pikachu;
import autonoma.pokemon.models.Pokemon;
import autonoma.pokemon.models.PokemonEletrico;
import autonoma.pokemon.models.Squirtle;

/**
 * Clase principal que contiene el método main para probar las instancias 
 * de los diferentes Pokémon y sus ataques.
 * @autor Mariana salgado lopez
 * @version 1.0.0
 * @since 20241002
 */
public class PokemonApp {

    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();

        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();

        charmander.atacarPlacaje();
        charmander.atacarAscuas();

        bulbasaur.atacarPlacaje();
        bulbasaur.atacarDrenaje();

        squirtle.atacarPlacaje();
        squirtle.atacarPistolaAgua();
    }
}

    

