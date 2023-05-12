package javadoc;
/**
 * 
 * @author MIGUEL
 * Clase que representa un auto, que es un tipo de vehículo
 */
public class Auto extends Vehiculo {

  /**
   * Número de puertas del auto
   */
  private int numeroPuertas;
  
  /**
   * Constructor para crear una nueva instancia de Auto.
   * @param marca Marca del auto
   * @param modelo Modelo del auto
   * @param numeroPuertas Número de puertas del auto
   */
  public Auto(String marca, String modelo, int numeroPuertas) {
    super(marca, modelo);
    this.numeroPuertas = numeroPuertas;
  }
  
 
  /**
   * Muestra los detalles del auto, incluyendo la marca, el modelo y el número puertas
   * @return Una cadena texto con los detalles del auto
   */
  @Override
  public String mostrarDetalles() {
    return super.mostrarDetalles() + ", Número de puertas: " + numeroPuertas;
  }
  
 
}
