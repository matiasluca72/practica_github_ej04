
package granja.entidades;

public class Conejo {

private String nombre;    
private String color;
private Integer edad;
private String alimento;
private String tamano;

    public Conejo() {
    }

    public Conejo(String nombre, String color, Integer edad, String alimento, String tamano) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.alimento = alimento;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getTamaño() {
        return tamano;
    }

    public void setTamaño(String tamaño) {
        this.tamano = tamaño;
    }

    @Override
    public String toString() {
        return "Conejo{" + "nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", alimento=" + alimento + ", tama\u00f1o=" + tamano + '}';
    }


}
