public class Platano extends Fruta implements Fruta_Interface {

  public Platano(){
    super(COLOR, PESO, FORMA);
  }

  public String textura(){
    return "lisa";
  }

  public String toString(){
    return super.toString()  + "\n Textura : " +  textura();
  }

}
