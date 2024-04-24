
package EjerciciosBasicosPoo;

/**
 *
 * @author LENOVO
 */
public class Ej4 {
    String calle;
    int numero;
    int superficie;
    double precio;
    boolean ConGarage;

    public Ej4() {
    }

    public Ej4(String calle, int numero, int superficie, double precio, boolean ConGarage) {
        this.calle = calle;
        this.numero = numero;
        this.superficie = superficie;
        this.precio = precio;
        this.ConGarage = ConGarage;
    }
    public void mostrarInformacion() {
        System.out.println("Informacion de la vivienda:");
        System.out.println(" Calle: " + calle);
        System.out.println(" Numero: " + numero);
        System.out.println(" Precio: " + precio + "$");
        System.out.println(" Superficie: " + superficie + " m^2");
        System.out.println(" Tiene garaje?: " + (ConGarage ? "Si" : "No"));
    }
    
}
