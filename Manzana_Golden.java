public class Manzana_Golden extends Manzana {

  public Manzana_Golden(){
    super();
  }

  public Manzana_Golden(String color, int peso, String forma, String textura, String nombre){
    super(color, peso, forma, textura, nombre);
  }

  public String slogan(){
    return "Soy muy brillante y jugosa";
  }

  public String toString(){
    return super.toString() + "\nSlogan : " +  slogan();
  }
}
