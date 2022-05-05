public interface Fruta_Interface{
  public final static String COLOR = "ROJO";
  public final static int PESO = 250;
  public final static String FORMA = "REDONDA";
  public final static String TEXTURA = "LISA";
  public final static String NOMBRE = "Frutita";


  public void textura(String textura);
  public void color(String color);
  public void nombre(String nombre);
  public void forma(String forma);
  public void peso (int peso);

  public int peso_mitad();

}
