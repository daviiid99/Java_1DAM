class Jugador_Noob{
  protected int velocidad;
  protected String nombre;
  protected int numero_vidas;
  protected int[] coordenadas;

  private final int[] COOR = {0,0};
  public final static int VELOCIDAD_MAXIMA = 9;
  public final static int MAXIMO_VIDAS = 3;

  public Jugador_Noob(String nombre){
    setNombre(nombre);
    setNumeroVidas();
    this.velocidad = VELOCIDAD_MAXIMA;
    this.coordenadas = COOR;
  }

  public Jugador_Noob(String nombre, int x, int y){
    setNombre(nombre);
    setNumeroVidas();
    caminar(x, y);

  }

  public void caminar(int x, int y){
    this.coordenadas[0] +=x;
    this.coordenadas[1] +=y;
  }

  public int getVelocidad(){
    return this.velocidad;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return this.nombre;
  }

  protected void setNumeroVidas(){
    this.numero_vidas = MAXIMO_VIDAS;
  }

  public String getCoordenadas(){
    return this.coordenadas[0] + "," + this.coordenadas[1];

  }


  protected int getNumeroVidas(){
    return this.numero_vidas;
    }

  public String toString(){
    return "\nNombre jugador : " + this.nombre + "\nNumero_Vidas : " + this.numero_vidas + "\nCamina a una velocidad de : " + this.velocidad + "\nDesplazamineto en coordenadas: " + this.getCoordenadas();
  }
}
