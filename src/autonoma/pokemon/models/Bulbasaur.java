/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 * Clase que representa a Bulbasaur, un Pokémon de tipo Planta.
 * Implementa la interface PokemonPlanta y sobrescribe los métodos 
 * para simular los ataques de tipo Planta de Bulbasaur.
 * @autor Mariana salgado lopez
 * @version 1.0.0
 * @since 20241002
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    public Bulbasaur() {
        super(1, "Bulbasaur", 6.9, "Primera");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy atacando con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y estoy atacando con Látigo Cepa");
    }
}

