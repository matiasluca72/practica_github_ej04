package granja.entidades;

/**
 *
 * @author Matias Luca Soto
 */
public class Pato {

    //ATRIBUTOS
    private String color;
    private Double tamanio;
    private Integer edad;
    private String tipo;
    private Boolean adoptado;

    //CONSTRUCTORES
    public Pato(String color, Double tamanio, Integer edad, String tipo, Boolean adoptado) {
        this.color = color;
        this.tamanio = tamanio;
        this.edad = edad;
        this.tipo = tipo;
        this.adoptado = adoptado;
    }

    public Pato() {
    }

    //GETTERS & SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
    }

    //toString
    @Override
    public String toString() {
        return "Pato -> " + "Color: " + color + " / Tamaño:" + tamanio + " / Edad: " + edad + " / Tipo: " + tipo + " / Adoptado?: " + adoptado;
    }

}
