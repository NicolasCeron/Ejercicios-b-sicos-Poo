
package EjerciciosBasicosPoo;

/**
 *
 * @author Nicolas Ceron Castaño
 * 
 * Crear una clase Papel. Atributos públicos String color, int grosor. Hacer programa Principal, con un
método main donde se creen objetos de la clase Papel (con constructor por defecto), dar valor a los
atributos y consultarlos por consola
 */
public class Ej1 {
    String color;
    int grosor;

    public Ej1(String color, int grosor) {
        this.color = color;
        this.grosor = grosor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
    
}
