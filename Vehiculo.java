class Vehiculo{
  protected int velocidad;
  private final static int VELOCIDAD_MAXIMA = 100;
  private final static int VELOCIDAD_MINIMA = 30;

  public Vehiculo(){
    conducir();
  }

  public Vehiculo(int velocidad){
    setVelocidad(velocidad);
  }

  public void setVelocidad(int velocidad){
    this.velocidad = velocidad;
    if (this.velocidad > VELOCIDAD_MAXIMA) {
      this.velocidad = VELOCIDAD_MAXIMA;
    } else if (this.velocidad < VELOCIDAD_MINIMA){
      this.velocidad = VELOCIDAD_MINIMA;
    }
  }

  public int getVelocidad(){
    return this.velocidad;
  }

  public void conducir(){
    this.velocidad = VELOCIDAD_MINIMA;
  }

  public void acelerar(int velocidad){
    setVelocidad(this.velocidad + velocidad);

  }

  public void frenar(int velocidad){
    setVelocidad(this.velocidad - velocidad);

  }

  public String toString(){
    return "\n-----------Datos Vehiculo-------\nVelocidad Conduccion : " + this.velocidad;
  }
}
