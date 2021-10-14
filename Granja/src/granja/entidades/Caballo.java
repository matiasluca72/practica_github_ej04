/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja.entidades;

public class Caballo {
    private String nombre;
    private String raza;
    private Integer edad;
    private String color;
    private boolean competitivo;
    private String respuesta;

    public Caballo() {
    }

    public Caballo(String nombre, String raza, Integer edad, String color, boolean competitivo, String respuesta) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.competitivo = competitivo;
        this.respuesta = respuesta;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCompetitivo() {
        return competitivo;
    }

    public void setCompetitivo(boolean competitivo) {
        this.competitivo = competitivo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Caballo{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", color=" + color + ", competitivo=" + respuesta + '}';
    }
    
    
}
