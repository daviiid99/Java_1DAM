import java.util.ArrayList;

class Mesa extends Mueble {
  private int numero_patas;

  public Mesa(){
    super();
    this.numero_patas = 4;

  }

  public Mesa(int numero_patas, String material, ArrayList<Integer> dimensiones, boolean esArmario){
    super(material, dimensiones, esArmario);
  }

  public Mesa(int numero_patas, String material, int ancho, int profundidad, int altura, boolean esArmario){
    super(material, ancho, profundidad,altura, esArmario);
    this.numero_patas = numero_patas;
  }

  public int getPatas(){
    return this.numero_patas;
  }

  public void setPatas(int patas){
    this.numero_patas = patas;
  }

  public String toString(){
    return super.toString() + "\nNumero Patas: " + this.numero_patas;
  }





}
