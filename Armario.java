import java.util.ArrayList;
import java.util.Arrays;

class Armario extends Mueble{
  private String tipo_puertas;
  private int numero_baldas;
  protected int profundidad;
  protected int altura;
  protected int ancho;

  public Armario(){
    super();
    this.tipo_puertas = "plegables";
    this.numero_baldas = 5;
    this.ancho = 100;
    this.altura = 120;
    this.profundidad = 100;
  }

    public Armario(String material, ArrayList<Integer> dimensiones, String tipo_puertas, int numero_baldas, boolean esArmario){
      super(material, dimensiones, esArmario);
      this.tipo_puertas = tipo_puertas;
      this.numero_baldas = numero_baldas;
      this.ancho = dimensiones.get(0);
      this.profundidad = dimensiones.get(1);
      this.altura = dimensiones.get(2);

    }

    public Armario(String material, int ancho, int profundidad, int altura, String tipo_puertas, int numero_baldas, boolean esArmario ){
      super(material, ancho, profundidad, altura, esArmario);
      this.tipo_puertas = tipo_puertas;
      this.numero_baldas = numero_baldas;
      this.ancho = ancho;
      this.altura = altura;
      this.profundidad = profundidad;
    }

    public void setTipoPuertas(String tipo){
      this.tipo_puertas = tipo;
    }

    public void setNumeroBaldas(int baldas){
      this.numero_baldas = baldas;
    }

    public String getTipoPuertas(){
      return this.tipo_puertas;
    }

    public int getNumeroBaldas(){
      return this.numero_baldas;
    }

    protected int Superficie(int ancho, int profundidad, int numero_baldas){
      return (ancho*profundidad)*numero_baldas;

    }

    public String toString(){
      return super.toString() + "\nSuperficie del Armario: " + this.Superficie(this.ancho, this.profundidad, this.numero_baldas) + "\nNumero baldas:" + this.numero_baldas + "\nTipo Puertas: " + this.tipo_puertas;
    }

}
