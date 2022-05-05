public abstract class Fruta {
  protected String color;
  protected int peso;
  protected String forma;

  public Fruta(String color, int peso, String forma){
    this.color = color;
    this.peso = peso;
    this.forma = forma;

  }

  public String toString(){
    return "\n----Fruta-----" + "\nColor : " + this.color + "\nPeso : " + this.peso + "\nForma : " + this.forma;
  }
}
