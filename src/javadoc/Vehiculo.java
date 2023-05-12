package javadoc;
/**
 * 
 * @author MIGUEL
 * @author CRISTIAN
 * 
 * Clase base para representar un vehículo generico
 */
public class Vehiculo {
  /**
   * Marca del vehiculo, por ejemplo "Toyota, "Ford", etc.
   */
  protected String marca;
 
  /**
   * Modelo de vehiculo, por ejemplo "Supra MK4", "Mustang", etc
   */
  protected String modelo;

  /**
   * Constructor para crear una instancia de Vehiculo
   * 
   * @param marca Marca del vehículo
   * @param modelo Modelo del vehículo
   */
  public Vehiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }
  
  /**
   * Muestra la marca y el modelo del vehículo
   * 
   * @return Una cadena de texto con la marca y modelo del vehículo
   */
  public String mostrarDetalles() {
    return "Marca: " + marca + ", Modelo: " + modelo;
  }
 
}
