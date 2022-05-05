public interface Fruta_Interface{
  public final static String COLOR = "ROJO";
  public final static int PESO = 250;
  public final static String FORMA = "REDONDA";
  public final static String TEXTURA = "LISA";
  public final static String NOMBRE = "Frutita";

  public void setTextura(String textura);
  public void setColor(String color);
  public void setNombre(String nombre);
  public void setForma(String forma);
  public void setPeso (int peso);

  public int peso_mitad();

}
