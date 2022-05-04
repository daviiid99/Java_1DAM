import java.util.Random;

class Pato extends Mascota implements Animal_interface{
  protected int excretando;
  protected int deposito_caca;
  protected int crias;

  public final static int EXCRETANDO = 0;
  public final static int DEPOSITO = 0;

  public Pato(){
    this(EXCRETANDO);
  }

  public Pato(int excretando){
    setExcretando(excretando);
  }

  public Pato(String nombre){
    setNombrePato(nombre);
  }

  public void setNombrePato(String nombre){
    super.darNombreMascota(nombre);
  }

  public void setAcariciarPato(){
    super.acariciar();
  }

  public int getNivelAmistad(){
    return super.getNivelAmistad();
  }


  public String getNombre(){
    return super.getNombreMascota();
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
    return "Cuac, cuac";
  }

  public String durmiendo(){
    return "Zzzzzzz";
  }

  public String comiendo(String alimentacion){
      return "Le has dado de comer " + alimentacion;
  }

  public String excretando(int deposito_caca){
    this.deposito_caca+=1;
    super.irAlBanio(this.deposito_caca);
    return "picaca";
  }


  public void setNumeroCrias(int crias){
    this.crias = crias;
  }

  public int getNumeroCrias(){
    return this.crias;
  }


  public boolean follando(){
    // Probabilidades de obtener patitos / Es del 60%
    Random rand = new Random();
    boolean bebes = false;
    int probabilidadBebes = rand.nextInt(100+1);

    if (probabilidadBebes <=60){
      bebes = true;
      setNumeroCrias(rand.nextInt(10) + 1);

    }
    return bebes;
  }


}
