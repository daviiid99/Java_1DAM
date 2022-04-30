class Pato extends Mascota implements Animal_interface{
  protected int excretando;
  protected int deposito_caca;

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

  public void setDeposito(int deposito_caca){
    this.deposito_caca += deposito_caca;
  }

  public void vaciarDeposito(){
    if (deposito_caca >=3) this.deposito_caca = 0;
  }

  public int getDepositoCaca(){
    return this.deposito_caca;
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
    setDeposito(deposito_caca);
    return "picaca";
  }


  public int follando(){
    return 0;
  }

}
