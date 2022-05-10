// Clase Persona Herencia
// Dos tipos de Herencia : extension (a los metodos del padre le añadimos métodos propios) y especializacion(modificamos los métodos del padre para adaptarlos a nuestras necesidades)

// A demás de la herencia por agregación o composición ( añadir clases como atributos de nuestra clase) explicado en coche

public class Persona{
  protected String nombre;
  protected String dni;

  // Constructor

  public Persona(){
    this.nombre = "David";
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

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setDni(String dni){
    this.dni = dni;
  }

  public String toString(){
    return "Me llamo " + this.nombre + " y mi dni es " + this.dni;
  }

}
