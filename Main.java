class Main{

  public static void main(String[] args) {
    Manzana miManzana = new Manzana();
    Platano miPlatano = new Platano();
    Manzana_Golden miManzanaGolden = new Manzana_Golden();

    miPlatano.textura("POCHA");
    miPlatano.color("AMARILLO");
    miPlatano.nombre("PLATANO");
    miPlatano.forma("ALARGADA");
    miPlatano.peso(100);
    System.out.println(miPlatano + "\nPeso mitad : " + miPlatano.peso_mitad());

    miManzana.textura("LISA");
    miManzana.nombre("MANZANA");
    miManzana.forma("REDONDA");
    System.out.println(miManzana + "\nPeso mitad : " + miManzana.peso_mitad());

    System.out.println(miManzanaGolden);

  }
}
