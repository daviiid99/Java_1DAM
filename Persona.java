// Clase Persona Herencia
// Dos tipos de Herencia : extension (a los metodos del padre le añadimos métodos propios) y especializacion(modificamos los métodos del padre para adaptarlos a nuestras necesidades)

// A demás de la herencia por agregación o composición ( añadir clases como atributos de nuestra clase) explicado en coche

public class Persona{
  private String nombre;
  private String dni;

  // Constructor

  public Persona(){
    this.nombre = "Celia";
    this.dni = "12345678A";
  }

  public Persona(String nombre, String dni){
    this.nombre = nombre;
    this.dni = dni;

  }

  // Get
  public String getNombre(){
    return this.nombre;
  }

  public String getDni(){
    return this.dni;
  }

  // Set

  public void setnombre(String nombre){
    this.nombre = nombre;
  }

  public void setDni(String dni){
    this.dni = dni;
  }

}
