class Mascota {
  protected String nombre;
  protected int nivel_amistad;
  protected int excrementos;

  public final static int NIVEL_AMISTAD = 0;
  public final static String NOMBRE = "Lucas";

  public Mascota(){
    this(NOMBRE);
  }

  public Mascota(String nombre){
    darNombreMascota(nombre);
  }

  public void setNivelAmistad(){
    if (this.nivel_amistad < 10 ) this.nivel_amistad += 1;
  }

  public int getNivelAmistad(){
    return this.nivel_amistad;
  }

  public void acariciar(){
    setNivelAmistad();

  }

  public void irAlBanio(int excrementos){
    this.excrementos = excrementos;

  }

  public void limpiar_excrementos(){
    if (this.excrementos >= 3) this.excrementos = 0 ;

  }

  public int getExcrementos(){
    return this.excrementos;
  }


  public void darNombreMascota(String nombre){
    this.nombre = nombre;
  }

  public String getNombreMascota(){
    return this.nombre;
  }

}
