class Arbol extends Planta{
  private float numero_ramas;
  private float numero_hojas;

  public Arbol(){
    super();
    this.numero_ramas = 500;
    this.numero_hojas = 20000;
  }

  public Arbol(String nombre_comun, String nombre_cientifico, String clima, String habitat, float altura, float numero_ramas, float numero_hojas, boolean semillas){
    super(nombre_comun, nombre_cientifico, clima, habitat, altura, semillas);
    this.numero_ramas = numero_ramas ;
    this.numero_hojas = numero_hojas;
  }

  public String toString(){
    return super.toString() + "\nNumero Hojas: " + this.numero_hojas + "\nNumero Ramas: " + this.numero_ramas;
  }



}
