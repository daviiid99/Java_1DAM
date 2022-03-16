class Profesor extends Persona{
  private double sueldo;
  private int numSS;


  public Profesor(){
    super();
    this.sueldo = 2100.45;
    this.numSS = 12345678;

  }

  public Profesor(String nombre, String dni, double sueldo, int numSS){
    super(nombre, dni);
    this.sueldo = sueldo;
    this.numSS = numSS;

  }

  public String toString(){
    return super.toString() + " y mi numero de SS es " + this.numSS + " y tengo un sueldo de " + this.sueldo;

  }
}
