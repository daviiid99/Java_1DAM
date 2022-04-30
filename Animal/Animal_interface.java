public interface Animal_interface{
  // Al declarar variables en una interfaz hay que inicializarlos
  // Pero no sirven porque no se heredan
  public final static String alimentacion = "comida";
  public final static int excretando = 0;
  public String durmiendo();
  public String comiendo(String alimentacion);
  public String onomatopeya();
  public String excretando(int deposito_caca);
  public boolean follando();

}
