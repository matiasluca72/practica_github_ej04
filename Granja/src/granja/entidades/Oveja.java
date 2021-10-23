package granja.entidades;

/**
 *
 * @author Noel
 */
public class Oveja {

    //ATRIBUTOS 
    private String raza;
    private Integer peso, altura, longitud;

    //CONSTRUCTOR VACÍO
    public Oveja() {
    }

    //CONSTRUCTORES PARAMETRIZADOS
    public Oveja(String raza, Integer peso, Integer altura, Integer longitud) {
        this.raza = raza;
        this.peso = peso;
        this.altura = altura;
        this.longitud = longitud;
    }

    //GETTERS Y SETTERS
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Oveja{" + "raza=" + raza
                + ", peso=" + peso
                + ", altura=" + altura
                + ", longitud=" + longitud + '}';
    }


}
