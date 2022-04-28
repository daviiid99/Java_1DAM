abstract class Gafas{
  // Variables por defecto
  protected String montura;
  protected String color;
  protected String accesoriosIncluidos;

  // Variables estáticas
  protected final static String MONTURA = "CORAZONES";
  protected final static String COLOR = "BLANCO";

  public Gafas(){
    this(MONTURA, COLOR);
  }

  public Gafas(String montura, String color){
    setColor(color);
    setMontura(montura);
  }

  public void setMontura(String montura){
    this.montura = MONTURA;
  }

  public void setColor(String color){
    if ( color !=  COLOR){
      this.color = color;
    } else {
      this.color =  COLOR;
    }
  }

  public String getMontura(){
    return this.montura;
  }

  public String getColor(){
    return this.color;
  }

public abstract boolean sonChinas();
public abstract String paisFabricacionGafas();

public String accesorios(){
  return "----- Accesorios ---- \nPañuelo";
}

public String toString(){
  return "--------- Gafas ---------- " + "\nMontura :" + this.montura + "\nColor : " + this.color;
}

}
