public class Monopatin extends Vehiculo implements Vehiculo_interface{
  private boolean se_Mueve;

  public Monopatin(){
    super();
  }

  public Monopatin(int velocidad){
    super(velocidad);
  }

  public boolean EnMovimiento(){
    se_Mueve = false;
    if (velocidad < 100 & velocidad >=30){
      se_Mueve = true;
    } return se_Mueve;
  }

  public String toString(){
    return super.toString() + "\nSe mueve rápido ? : " + this.EnMovimiento();
  }


}
