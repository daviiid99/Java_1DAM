class Main {
  public static void main(String[] args){
    Electrodomestico miElectrodomestico = new Electrodomestico(120,"miColor","miConsumo",120);
    Electrodomestico miElectrodomesticoF = new Electrodomestico(120, "F");
    Electrodomestico miElectrodomesticoAAA = new Electrodomestico(120, "AAA");
    Electrodomestico miElectrodomesticoPrecioNull = new Electrodomestico(-100, "F");

    Electrodomestico miMuebleDefecto = new Electrodomestico();
    // Al rellenar miElectrodomestico los valores introducidos para color y consumo no son válidos para comprobar el funcionamiento de los filtros.
    System.out.println(miElectrodomestico);

    // Probamos el constructor por defecto que usará el color blanco y un consumo de tipo F
    System.out.println("Probamos el mueble por defecto\nque usará el color blanco y un consumo de tipo F");
    System.out.println(miMuebleDefecto);

    //Probamos los consumos energeticos en los extremos

    System.out.println("\nProbamos el mueble con mayor consumo\nQue usará el consumop F");
    System.out.println(miElectrodomesticoF);

    System.out.println("\nProbamos el mueble con mayor consumo\nQue usará el consumo AAA");
    System.out.println(miElectrodomesticoAAA);

    System.out.println("\nProbamos a pasarle un precio negativo");
    System.out.println(miElectrodomesticoPrecioNull);


  }
}