package javadoc;
/**
 * 
 * @author MIGUEL
 * Clase principal para ejecutar la aplicación
 */
public class Main {

  /**
   * El método main es el punto de entrada para la ejecución de la aplicación
   * En este método, creamos un auto y mostramos su detalle
   * @param args Argumentos de linea de comandos. No se utilizan para esta aplicación
   */
  public static void main(String[] args) {
    // Crea un nuevo auto con marca "Toyota" 
    Auto miAuto = new Auto("Toyota", "Supra MK4", 4);
    
    System.out.println(miAuto.mostrarDetalles());
  }

}
