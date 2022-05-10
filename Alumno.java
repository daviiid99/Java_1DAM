class Alumno extends Persona{
  private String grado;

  enum Color{
    AZUL,
    AMARILLO,
    VERDE,
    ROJO
  }

  private enum Nota{
    SOBRESALIENTE, 
    NOTABLE, 
    BIEN, 
    SUFICIENTE, 
    INSUFICIENTE
  }


  private Nota nota;
  private String resultadoNotas; //No tiene set ni get porque se utiliza solo en el switch


  // Como traduce java un enum
    /*

  class Nota{
    public static final Nota SOBRESALIENTE = new Nota();
    public static final Nota NOTABLE = new Nota();
    public static final Nota BIEN = new Nota();
  
  } **/

  public Alumno(){
    super();
    this.grado = "DAM";
    this.nota = Nota.SUFICIENTE;
  }

  public Alumno(String nombre, String dni, String grado){
    // lLAMA AL CONSTRUCTOR DE LA CLASE SUPERIOR (La que extendemos)
    super(nombre, dni);
    this.grado = grado;
    this.nota = Nota.SUFICIENTE;

  }

  public Alumno(Alumno alumno){
    super(alumno.nombre, alumno.dni);
    this.grado = alumno.grado;
    this.nota = alumno.nota;
  }

  private String stringNotas(){

    switch(this.nota){

    case SOBRESALIENTE :
      resultadoNotas = "Oleeeeee| Así se hace :)";
      break;

    case NOTABLE :
      resultadoNotas = "Lo has hecho muy bien :)";
      break;

    case BIEN :
      resultadoNotas = "Bien";
      break;

    case SUFICIENTE :
      resultadoNotas = "tA' BIEN";
      break;

    case INSUFICIENTE :
      resultadoNotas = "ASI NO";
      break;

    }
    return resultadoNotas;
  }

  public String toString(){
    return super.toString() + ".\nEstoy en el grado de " + this.grado + "\nMi nota es : " + this.nota + "\n y el profesor me ha dicho que " + this.stringNotas();
  }

}
