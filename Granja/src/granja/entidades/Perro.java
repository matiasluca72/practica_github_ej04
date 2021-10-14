/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja.entidades;

/**
 *
 * @author flora
 */
public class Perro {

    private String nombre;
    private String tamanio;
    private String edad;
    private String tipo;
    private String color;
    private boolean cola;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String tamanio, String edad, String tipo, String color, boolean cola, String raza) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.edad = edad;
        this.tipo = tipo;
        this.color = color;
        this.cola = cola;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", tamanio=" + tamanio + ", edad=" + edad + ", tipo=" + tipo + ", color=" + color + ", cola=" + cola + ", raza=" + raza + '}';
    }

}
