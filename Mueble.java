import java.util.ArrayList;
import java.util.Arrays;

public class Mueble{
  private String material;
  protected ArrayList<Integer> dimensiones;
  protected int profundidad;
  protected int altura;
  protected int ancho;
  protected boolean esArmario;


  public Mueble(){
    this.material = "Madera de Abedul";
    this.dimensiones =  new ArrayList<Integer>(Arrays.asList(50, 50, 50));
    this.ancho = dimensiones.get(0);
    this.profundidad = dimensiones.get(1);
    this.altura = dimensiones.get(2);
    this.esArmario = true;

  }

  public Mueble(String material, int ancho, int profundidad, int largo, boolean esArmario){
    this.material = material;
    this.dimensiones =  new ArrayList<Integer>(Arrays.asList(ancho, profundidad, largo));
    this.ancho = ancho;
    this.altura = altura;
    this.profundidad = profundidad;
    if ( esArmario == false) this.esArmario = false;
    if ( esArmario == true) this.esArmario = true;

  }

  public Mueble (String material, ArrayList<Integer> dimensiones, boolean esArmario){
    this.material = material;
    this.dimensiones =  dimensiones;
    this.ancho = dimensiones.get(0);
    this.profundidad = dimensiones.get(1);
    this.altura = dimensiones.get(2);
    if ( esArmario == false) this.esArmario = false;
    if ( esArmario == true) this.esArmario = true;
  }

  public String getMaterial(){
    return this.material;
  }

  public ArrayList<Integer> getDimensiones(){
    return this.dimensiones;
  }

  public void setMaterial(String material){
    this.material = material;
  }

  public void setDimensiones(int ancho, int altura, int profundidad){
    this.dimensiones =  new ArrayList<Integer>(Arrays.asList(ancho, profundidad, altura));
  }

  public void setDimensiones(ArrayList<Integer> dimensiones){
    this.dimensiones = dimensiones;
  }

  protected int Superficie(int ancho, int profundidad){
    return ancho*profundidad;

  }

  public String toString(){
    String especificaciones = "-----------Descripcion Mueble ----------\n Material: " + this.material + "\nDimensiones: " + this.dimensiones + "\nSuperficie: " + this.Superficie(this.ancho, this.profundidad);
    if (esArmario == true){
      especificaciones = "-----------Descripcion Mueble ----------\n Material: " + this.material + "\nDimensiones: " + this.dimensiones;
    }
    return especificaciones;
  }



}
