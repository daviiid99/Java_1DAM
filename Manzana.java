public class Manzana extends Fruta {
  protected boolean ser_perfecta;

  public Manzana(){
    super();
  }

  public Manzana(String color, int peso, String forma, String textura, String nombre){
    super(color, peso, forma, textura, nombre);
  }

  public boolean ser_perfecta(){
    ser_perfecta = false;
    if (this.peso > 200){
      ser_perfecta = true;
    }
    return ser_perfecta;
  }

  public int peso_mitad(){
    return this.peso/2;
  }

  public String toString(){
    return super.toString() + "\n Manzana Perfecta : " + ser_perfecta();
  }


}
