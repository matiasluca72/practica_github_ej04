/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja.entidades;

/**
 *
 * @author Nicolás
 */
public class Gato {

    private String nombre, raza;
    private int vidas, peso;
    private boolean tieneCola;

    public Gato() {
    }

    public Gato(String nombre, String raza, int vidas, int peso, boolean tieneCola) {
        this.nombre = nombre;
        this.raza = raza;
        this.vidas = vidas;
        this.peso = peso;
        this.tieneCola = tieneCola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + ", vidas=" + vidas + ", peso=" + peso + ", tieneCola=" + tieneCola + '}';
    }

}
