/*
| Electrodomestico |
| (-) privado (+) publico (# protegido)
| -----------------------------------
| - precio Base
| - color
| - consumo_energetico
| - peso
|------------------------------------------
| + precio_final()
**/

import java.util.Arrays;
import java.util.ArrayList;


class Electrodomestico{
  private double precio_base;
  private String color;
  private String consumo_energetico;
  private double peso;

  // Variables estáticas
  private final static String COLOR = "blanco";
  private final static  double PRECIO = 100;
  private final static  String CONSUMO = "F";
  private final static double PESO = 20;
  private final static ArrayList<String> CONSUMOS = new ArrayList<>(Arrays.asList("F", "E", "D", "C", "B", "A", "AA", "AAA"));
  private final static ArrayList<String> COLORES = new ArrayList<>(Arrays.asList("BLANCO", "ROJO", "NEGRO", "AZUL", "METALIZADO"));


  public Electrodomestico(){
    this(PRECIO, COLOR, CONSUMO, PESO);
  }

  public Electrodomestico(double precio_base, String consumo_energetico){
    this(precio_base, COLOR, consumo_energetico, PESO);

}

  public Electrodomestico(double precio_base, String color, String consumo_energetico, double peso ){
    this.precio_base = precio_base;
    setColor(color);
    setConsumoEnergetico(consumo_energetico);
    this.peso = peso;

}

public Electrodomestico(Electrodomestico electrodomestico){
  this(electrodomestico.precio_base, electrodomestico.color, electrodomestico.consumo_energetico, electrodomestico.peso);
}

  public void setPrecioBase(double precio_base){
    this.precio_base = precio_base;
  }

  public void setColor(String color){
    comprobar_Color(color);

  }

  public void setConsumoEnergetico(String consumo_energetico){
  comprobar_Consumo(consumo_energetico);

  }

  public void setPeso(double peso){
    this.peso = peso;
  }

  public double getPrecioBase(){
    return this.precio_base;
  }

  public String getColor(){
    return this.color;
  }

  public String getConsumoEnergetico(){
    return this.consumo_energetico;

  }

  public double getPeso(){
    return this.peso;
  }

  public void comprobar_Color(String color){
    if (comprobar_Valor_En_Lista(color, COLORES)){
      this.color = color.toUpperCase();
    } else {
    this.color = COLOR;
    }
  }

  public void comprobar_Consumo(String consumo){
    if (comprobar_Valor_En_Lista(consumo, CONSUMOS)){
      this.consumo_energetico = consumo.toUpperCase();
    } else {
    this.consumo_energetico = CONSUMO;
    }
  }

  public boolean comprobar_Valor_En_Lista(String valor, ArrayList<String> lista){
    boolean Existe = false;

    for ( int i = 0; i < lista.size() && !Existe; i++){
      if (lista.get(i).equals(valor.toUpperCase())){
          Existe = true;
      }
    }
    return Existe;
  }

  public int DeterminarImporteConsumo(double precio_base, String consumo_energetico){
    int eficiencia = 0;
    for (int i = 0; i < CONSUMOS.size(); i++){
      if (CONSUMOS.get(i).equals(consumo_energetico)) eficiencia = i;
    }
    return eficiencia * 20;
  }

  public int DeterminarDescuentoBlanco(String color){
    int descuento = 0;
    if ( color == COLOR) descuento = 20;
    return descuento;
  }

  public double DeterminarImportePeso(double peso){
    return (Math.floor(peso/20))*30;
  }



  public double precio_final(double precio_base, String consumo_energetico, double peso, String color){
    double precio_final =  precio_base + DeterminarImporteConsumo(precio_base, consumo_energetico) + DeterminarImportePeso(peso) -
    DeterminarDescuentoBlanco(color);

    return precio_final;

  }


  public String toString(){
    return "-------- Caracteristicas Electrodomestico --------" + "\nPrecio base : " + this.precio_base + "€" + "\nPrecio final : " + precio_final(this.precio_base, this.consumo_energetico, this.peso, this.color) + "€"  + "\nColor Energético : " + this.color + "\nConsumo: " + this.consumo_energetico + "\nPeso : " + this.peso + "kg";
  }


}
