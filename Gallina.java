class Gallina extends Animal{
  private int huevos_por_dia;
  private int huevos_totales;
  private int dias_poniendo_huevos;

  public Gallina(){
      super();
      this.huevos_por_dia = 2;
      this.dias_poniendo_huevos = 2;
      this.huevos_totales = CalcularHuevos(huevos_por_dia, dias_poniendo_huevos);

  }

  public Gallina(String especie, int numero_animales, String comida_fav, int num_patas, int huevos_por_dia, int huevos_totales, int dias_poniendo_huevos){
    super(especie, numero_animales, comida_fav, num_patas);
    this.huevos_por_dia = huevos_por_dia;
    this.dias_poniendo_huevos = dias_poniendo_huevos;
    this.huevos_totales = CalcularHuevos(huevos_por_dia, dias_poniendo_huevos);
  }

  public void setHuevosPorDia(int huevos_x_dia){
    this.huevos_por_dia = huevos_x_dia;
  }

  public void setDiasPoniendo(int dias_poniendo_huevos){
    this.dias_poniendo_huevos = dias_poniendo_huevos;
  }

  public int getHuevosPorDia(){
    return this.huevos_por_dia;
  }

  public int getDiasPoniendoHuevos(){
    return this.dias_poniendo_huevos;
  }

  public int getHuevosTotales(){
    return this.huevos_totales;
  }

  public int CalcularHuevos(int huevos_x_dia, int dias){
    return this.huevos_totales = dias * huevos_x_dia;
  }

  public String chisteGallina(){
    return  "¿Para qué cruzó la gallina la carretera? Para llegar al otro lado.";
  }

  public void NumeroGalinas(int numero){
      super.setNumeroAnimales(numero);
    }

  public int NumeroPicos(){
    return super.getNumeroAnimales();
  }

  public int NumeroPatas(){
    return super.getNumeroAnimales()*2;
  }

  public int NumeroPatasYPicos(){
    return super.getNumeroAnimales() +  super.getNumeroAnimales()*2;
  }

  public String toString(){
    return super.toString() + "\nHuevos por dia : " + this.huevos_por_dia + "\nDias Poniendo Huevos: " + this.dias_poniendo_huevos + "\nHuevos Totales: " + this.huevos_totales;

  }

}
