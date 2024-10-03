/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 * Clase abstracta que representa un Pokémon. 
 * Contiene atributos comunes como número de la Pokédex, nombre, peso y temporada.
 * También define ataques básicos que comparten la mayoría de los Pokémon.
 * @autor Mariana salgado lopez
 * @version 1.0.0
 * @since 20241002
 */

public  abstract class Pokemon {
    /// atributos
    private int numPokedex;
    private String nombre;
    private double peso;
    private String temporada;
    
    /**
     * Constructor para la clase Pokémon.
     * 
     * @param numPokedex Número en la Pokédex del Pokémon.
     * @param nombre Nombre del Pokémon.
     * @param peso Peso del Pokémon en kilogramos.
     * @param temporada Temporada a la que pertenece el Pokémon.
     */

    public Pokemon(int numPokedex, String nombre, double peso, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }
    /// metodos 
    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    ///metodos de acceso
    public void atacarPlacaje() {
        System.out.println("Soy " + nombre + " y estoy atacando con Placaje");
    }

    public void atacarArañazo() {
        System.out.println("Soy " + nombre + " y estoy atacando con Arañazo");
    }

    public void atacarMordisco() {
        System.out.println("Soy " + nombre + " y estoy atacando con Mordisco");
    }
}
    
    

