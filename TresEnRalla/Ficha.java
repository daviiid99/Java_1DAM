class Ficha{
  private String forma;

  public Ficha(){
    this.forma = "X";

  }

  public Ficha(String ficha){
    ficha = ficha.toUpperCase();
    if (ficha.equals("X")) this.forma = "X";
    if (ficha.equals("O")) this.forma = "O";
    if ((ficha.equals("O")) == false && (ficha.equals("X")) == false) this.forma = "X";
}

  public void setForma(String ficha){
    this.forma = ficha;
  }

  public String getForma(){
    return this.forma;
  }



}
