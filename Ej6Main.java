
package EjerciciosBasicosPoo;

/**
 *
 * @author LENOVO
 */
public class Ej6Main {
    public static void main(String[] args) {
        Ej6 Chalet = new Ej6("Segunda",5,500.50,1500,true);
        
        System.out.println("--------");
        System.out.println("El nombre de la calle es: "+Chalet.getCalle());
        System.out.println("numero de parcelas: "+Chalet.getNumParcela());
        System.out.println("El precio es: "+Chalet.getPrecio()+"$");
        System.out.println("La superficie es de: "+Chalet.getSuperficie()+"cm2");
        System.out.println("La casa tiene piscina: "+Chalet.isConPiscina());    
    }   
}
