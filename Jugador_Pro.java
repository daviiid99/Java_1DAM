class Jugador_Pro extends Jugador_Noob{
  protected Vehiculo vehiculoPro = new Vehiculo();
  protected Coche miCochePro = new Coche();
  protected Monopatin miMonopatinPro = new Monopatin();

  public Jugador_Pro(){
    super("Pepe con monopatin");
    this.miMonopatinPro = new Monopatin();
  }

  public Jugador_Pro(String nombre){
    super(nombre);
    this.vehiculoPro = new Vehiculo();
  }

  public Jugador_Pro(String nombre, int velocidad){
    super(nombre);
    this.miCochePro = new Coche(velocidad);
  }

  public Vehiculo miVehiculo(){
    return vehiculoPro;
  }

  public Coche miCoche(){
    return miCochePro;
  }

  public Monopatin miMonopatin(){
    return miMonopatinPro;
  }

  public String toString(){
    return super.toString();
  }

}
