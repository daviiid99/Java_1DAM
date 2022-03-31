class Zorro extends Animal{
  private int dias_visita_granja;

  public Zorro(){
    super();
    this.dias_visita_granja = 0;

  }

  public Zorro(String especie, int numero_animales, String comida_fav, int num_patas, int dias_visita_granja){
    super(especie, numero_animales, comida_fav, num_patas);
    this.dias_visita_granja = dias_visita_granja;
  }

  public void setNumeroDiasVisita(int dias){
    this.dias_visita_granja = dias;
  }

  public int getNumeroDiasVisita(){
    return this.dias_visita_granja;
  }

  public int OtroDiaMas(){
    return this.dias_visita_granja+=1;
  }

  public String chisteZorro(){
    return  "¿Para qué cruzó el zorro la carretera? Para comerse a las gallinas.";
  }

  public void NumeroZorros(int numero){
    super.setNumeroAnimales(numero);
  }


public String toString(){
  return super.toString() + "\nDias de visita a la granja: " + this.dias_visita_granja + "\nChiste: " + chisteZorro();
}

}
