public abstract class Fruta implements Fruta_Interface {
  protected String color;
  protected int peso;
  protected String forma;
  protected String textura;
  protected String nombre;

  public Fruta(){
    this(COLOR, PESO, FORMA, TEXTURA, NOMBRE);
  }

  public Fruta(String color, int peso, String forma, String textura, String nombre){
    setPeso(peso);
    setColor(color);
    setForma(forma);
    setTextura(textura);
    setNombre(nombre);
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setTextura(String textura){
    this.textura = textura;
  }

  public String getTextura(){
    return this.textura;
  }

  public void setPeso(int peso){
    this.peso = peso;
  }

  public int getPeso(){
    return this.peso;
  }

  public void setForma(String forma){
  this.forma = forma;
  }

  public String getForma(){
    return this.forma;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public abstract int peso_mitad();

  public String toString(){
    return "\n----Fruta-----" + "\nNombre : " + this.nombre + "\nColor : " + this.color + "\nPeso : " + this.peso + "\nForma : " + this.forma + "\n Textura : " + this.textura;
  }
}
