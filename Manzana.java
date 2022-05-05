public class Manzana extends Fruta {
  protected boolean ser_perfecta;

  public Manzana(){
    super(COLOR, PESO, FORMA);
  }

  public Manzana(String color, int peso, String forma){
    super(color, peso, forma);
    setPeso(peso);

  }

  public void setPeso(int peso){
    this.peso = peso;
  }

  public int getPeso(){
    return this.peso;
  }

  public boolean ser_perfecta(){
    ser_perfecta = false;
    if (this.peso > 200){
      ser_perfecta = true;
    }
    return ser_perfecta;
  }

  public String toString(){
    return super.toString() + "\n Manzana Perfecta : " + ser_perfecta();
  }


}
