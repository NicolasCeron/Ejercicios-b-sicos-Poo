
package EjerciciosBasicosPoo;

/**
 *
 * @author LENOVO
 */
public class Ej6 {
   private String calle;
   private int numParcela;
   private double precio;
   private int superficie;
   private boolean conPiscina;
   
    public Ej6(){
        this.calle = "";
        this.numParcela = 1;
        this.precio = 0.0;
        this.superficie = 0;
        this.conPiscina = false;
    }
    
    public Ej6(String calle, int numParcela, double precio, int superficie, boolean conPiscina) {
       if (numParcela>10 || numParcela<1){
            System.out.println("El numero de Parcelas debe estar entre 1 y 10");
        }  
       if (precio<0.0){     
           System.out.println("El preciono no puede ser negativo");
        }
       if (superficie<0 || superficie>2000){
           System.out.println("la superficie no puede ser negativa ni mayor a 2000");
       }
        this.calle = calle;
        this.numParcela = numParcela;
        this.precio = precio;
        this.superficie = superficie;
        this.conPiscina = conPiscina;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }

    
    
    

    
   
}
