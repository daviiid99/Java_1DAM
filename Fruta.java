public class Fruta implements Fruta_Interface {
  protected String color;
  protected int peso;
  protected String forma;
  protected String textura;
  protected String nombre;

  public Fruta(){
    this(COLOR, PESO, FORMA);
  }

  public Fruta(String color, int peso, String forma){
    color(color);
    peso(peso);
    forma(forma);
    textura(TEXTURA);
    nombre(NOMBRE);
  }

  public void textura(String textura){
    this.textura = textura;
  }

  public String textura(){
    return this.textura;
  }

  public void color(String color){
    this.color = color;
  }

  public void nombre(String nombre){
    this.nombre = nombre;
}

  public void forma(String forma){
      this.forma = forma;
  }

  public void peso(int peso){
    this.peso = peso;
  }

  public int peso_mitad(){
    return this.peso/2;
  }

  public String toString(){
    return "\n----Fruta-----" + "\nNombre : " + this.nombre + "\nColor : " + this.color + "\nPeso : " + this.peso + "\nForma : " + this.forma + "\n Textura : " + textura();
  }
}
