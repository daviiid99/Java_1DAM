// Clase gato extiende la clase Animal
/*class Gato extends Animal{

  public String onomatopeya(){
    return "Miau";
  }

  public String durmiendo(){
    return super.durmiendo() + "RRRRrrrRRRRRrrrr";
  }

  public String comiendo(){
      this.alimentacion = "Pescado";
      return "Yo como " + this.alimentacion;
  }

}
*/

// Clase gato implementa la interfaz
import java.util.Random;

class Gato extends Mascota implements Animal_interface {
  protected int excretando;
  protected int deposito_caca;
  protected int crias;

  public final static int EXCRETANDO = 0;
  public final static int DEPOSITO = 0;

  public Gato(){
    this(EXCRETANDO);
  }

  public Gato(int excretando){
    setExcretando(excretando);
  }

  public Gato(String nombre){
    setNombreGato(nombre);
  }

  public void setNombreGato(String nombre){
    super.darNombreMascota(nombre);
  }

  public String getNombre(){
    return super.getNombreMascota();
  }

  public void setAcariciarGato(){
    super.acariciar();
  }

  public int getNivelAmistad(){
    return super.getNivelAmistad();
  }

  public void setExcretando(int excretando){
    this.excretando = excretando;
  }

  public int getExcretando(){
    return this.excretando;
  }

  public void setDeposito(int deposito_caca){
    this.deposito_caca += deposito_caca;
  }

  public void vaciarDeposito(int deposito_caca){
    if (deposito_caca >=3) super.limpiar_excrementos();
  }

  public int getDepositoCaca(){
    return super.getExcrementos();
  }

  public String onomatopeya(){
    return "Miau";
  }

  public String durmiendo(){
    return "Zzzzzzz";
  }

  public String comiendo(String alimentacion){
      return "Le has dado de comer " + alimentacion;
  }

  public String excretando(int deposito_caca){
    String loQueToca = "pipi";
    excretando +=1;

    if (excretando == 3){
      loQueToca = "caca";
      excretando = 0;
      this.deposito_caca+=1;
      super.irAlBanio(this.deposito_caca);
    }
    return loQueToca;
  }

  public void setNumeroCrias(int crias){
    this.crias = crias;
  }

  public int getNumeroCrias(){
    return this.crias;
  }


  public boolean follando(){
    // Probabilidades de obtener gatitos / Es del 90%
    Random rand = new Random();
    boolean bebes = false;
    int probabilidadBebes = rand.nextInt(100+1);
    
    if (probabilidadBebes <=90){
      bebes = true;
      setNumeroCrias(rand.nextInt(10) + 1);

    }
    return bebes;
  }

}
