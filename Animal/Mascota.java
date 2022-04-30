class Mascota {
  protected String nombre;
  protected int nivel_amistad;

  public final static int NIVEL_AMISTAD = 0;
  public final static String NOMBRE = "Lucas";

  public void setNivelAmistad(){
    this.nivel_amistad += 1;
  }

  public int getNivelAmistad(){
    return this.nivel_amistad;
  }

  public void acariciar(){
    setNivelAmistad();

  }

  public void limpiar_excrementos(int excrementos){
    if (excrementos >= 3);

  }

  public void darNombreMascota(String nombre){
    this.nombre = nombre;
  }

  public String getNombreMascota(){
    return this.nombre;
  }

}
