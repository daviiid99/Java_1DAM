class Main{

  public static void main(String[] args) {
    Manzana miManzana = new Manzana();
    Platano miPlatano = new Platano();
    Manzana_Golden miManzanaGolden = new Manzana_Golden();

    miPlatano.setTextura("POCHA");
    miPlatano.setColor("AMARILLO");
    miPlatano.setNombre("PLATANO");
    miPlatano.setForma("ALARGADA");
    miPlatano.setPeso(100);
    System.out.println(miPlatano + "\nPeso mitad : " + miPlatano.peso_mitad());

    miManzana.setTextura("LISA");
    miManzana.setNombre("MANZANA");
    miManzana.setForma("REDONDA");
    System.out.println(miManzana + "\nPeso mitad : " + miManzana.peso_mitad());
    miManzanaGolden = new Manzana_Golden("NARANJA", 300, "REDONDITA", "LISA", "MANZANA golden");
    System.out.println(miManzanaGolden);

    System.out.println(miPlatano.getColor());
    System.out.println(miManzanaGolden.getNombre());

  }
}
