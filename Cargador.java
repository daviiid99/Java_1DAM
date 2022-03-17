// DAVID MOLINA MORALES

class Cargador{
  private Cable cableUno;
  private Adaptador adaptadorUno;

  public Cargador(){
    this.cableUno = new Cable();
    this.adaptadorUno = new Adaptador();
  }

  public Cargador(float longitud, String entrada, String salida, boolean USB, int entradaPot, int salidaPot, int puerto){
    this.cableUno = new Cable(longitud, entrada, salida, USB);
    this.adaptadorUno = new Adaptador(entradaPot, salidaPot, puerto);
  }

  public Cable getCableUno(){
    return this.cableUno;
  }

  public Adaptador getAdaptadorUno(){
    return this.adaptadorUno;
  }

  public String toString(){
    return "------Caracteristicas Cargador--------\n\n" + adaptadorUno + cableUno;
  }
}
