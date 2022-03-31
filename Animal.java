class Animal{
  protected String especie;
  protected int numero_animales;
  protected String comida_fav;
  protected int num_patas;

  public Animal(){
    this.especie = "ave";
    this.numero_animales = 5;
    this.comida_fav = "palomitas de maiz";
    this.num_patas = 2;
  }

  public Animal(String especie, int numero_animales, String comida_fav, int num_patas){
    this.especie = especie;
    this.numero_animales = numero_animales;
    this.comida_fav = comida_fav;
    this.num_patas = num_patas;
  }

  public void setEspecie(String especie){
    this.especie = especie;
  }

  public void setNumeroAnimales(int numero_animales){
    this.numero_animales = numero_animales;
  }

  public void setComidaFav(String comida_fav){
    this.comida_fav = comida_fav;
  }

  public void setNumPatas(int num_patas){
    this.num_patas = num_patas;
  }

  public String getEspecie(){
    return this.especie;
  }

  public int getNumeroAnimales(){
    return this.numero_animales;
  }

  public String getComidaFav(){
    return this.comida_fav;
  }

  public int getNumeroPatas(){
    return this.num_patas;
  }

  public String getComidaAnimal(){
    return this.comida_fav;
  }

  public String getChisteAnimal(){
    return "¿Por qué cruzó el animal de dos patas la carretera? 0V0";
  }

  public String toString(){
    return "------------Descripcion Animal----------\nEspecie: " + this.especie + "\nNumero Animales : " + this.numero_animales + "\nComida favorita: "  + this.comida_fav + "\nNumero Patas : " + this.num_patas;
  }

}
