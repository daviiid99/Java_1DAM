class Ficha{
  protected String forma;
  private String color;

  public Ficha(){
    this.forma = "X";
    this.color = "azul";
  }

  public Ficha(String ficha){
    ficha = ficha.toUpperCase();
    if (ficha.equals("X")) this.forma = "X";
    if (ficha.equals("O")) this.forma = "O";
    if ((ficha.equals("O")) == false && (ficha.equals("X")) == false) this.forma =ficha;
    this.color = "rojo";
}

  public Ficha(String ficha, String color){
    ficha = ficha.toUpperCase();
    if (ficha.equals("X")) this.forma = "X";
    if (ficha.equals("O")) this.forma = "O";
    if ((ficha.equals("O")) == false && (ficha.equals("X")) == false) this.forma =ficha;
    this.color = color;
}

  public Ficha(Ficha ficha){
    this.forma = ficha.forma;
    this.color = ficha.color;
  }

  public void setForma(String ficha){
    this.forma = ficha;
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

}
