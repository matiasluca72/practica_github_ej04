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
public class prueba {
    
    private String nombre;
    private String apodo;

    public prueba() {
    }

    public prueba(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "prueba{" + "nombre=" + nombre + ", apodo=" + apodo + '}';
    }
    
    
}
