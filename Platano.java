public class Platano extends Fruta  {

  public Platano(){
    super();
  }

  public Platano(String color, int peso, String forma, String textura, String nombre){
    super(color, peso, forma, textura, nombre);
  }

  public int peso_mitad(){
    return this.peso/2;
  }

  public String toString(){
    return super.toString();
  }

}
