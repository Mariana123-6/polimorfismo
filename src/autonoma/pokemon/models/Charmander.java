/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 * Clase que representa a Charmander, un Pokémon de tipo Fuego.
 * Implementa la interface PokemonFuego y sobrescribe los métodos 
 * para simular los ataques de tipo Fuego de Charmander.
 * @autor Mariana salgado lopez
 * @version 1.0.0
 * @since 20241002
 */
public class Charmander extends Pokemon implements PokemonFuego {
    public Charmander() {
        super(4, "Charmander", 8.5, "Primera");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con Lanzallamas");
    }
}
