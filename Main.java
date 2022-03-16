class Main{
  public static void main(String[] args){
    Planta miPlanta = new Planta();
    Arbol miArbol = new Arbol();

    Arbol miPino = new Arbol("Pino", "Pinus", "Montaña", "Norte Europa", 4500, 500, 40000, true);

    System.out.println(miPlanta);
    System.out.println(miArbol);
    System.out.println(miPino);
  }
}
