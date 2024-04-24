
package EjerciciosBasicosPoo;

/**
 *
 * @author LENOVO
 */
public class Ej5 {
   private int creditos;
    private String nombre;

    public Ej5(int creditos, String nombre) {
      if (creditos<=0){
          System.out.println("Los creditos no pueden ser negativos ");
      } 
        this.creditos = creditos;
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
