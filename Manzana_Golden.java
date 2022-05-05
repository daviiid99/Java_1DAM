public class Manzana_Golden extends Manzana {

  public Manzana_Golden(){
    super(COLOR, PESO, FORMA);
  }

  public Manzana_Golden(String color, int peso, String forma){
    super(color, peso, forma);
  }

  public String slogan(){
    return "Soy muy brillante y jugosa";
  }

  public String toString(){
    return super.toString() + "\nSlogan : " +  slogan();
  }
}
