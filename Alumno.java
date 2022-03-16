class Alumno extends Persona{
  private String grado;

  public Alumno(){
    super();
    this.grado = "DAM";
  }

  public Alumno(String nombre, String dni, String grado){
    // lLAMA AL CONSTRUCTOR DE LA CLASE SUPERIOR (La que extendemos)
    super(nombre, dni);
    this.grado = grado;
  }

  public String toString(){
    return super.toString() + ".\nEstoy en el grado de " + this.grado;
  }

}
