// DAVID MOLINA MORALES
import java.util.Scanner;
import java.util.ArrayList;


class Main {
  public static void main(String[] args){
    System.out.println("DAVID MOLINA MORALES");
    Scanner Teclado = new Scanner(System.in);
    Cargador cargadorMovil = new Cargador();
    Adaptador adaptadorMovil = new Adaptador();
    Cable cableMovil = new Cable();
    ArrayList<String> listaCables = new ArrayList<String>();
    ArrayList<Boolean> listaCablesUSBData = new ArrayList<Boolean>();
    int longitud;
    String entrada;
    String salida;
    boolean usb;
    int entradaPot;
    int salidaPot;
    int puerto;

    // Añadimos los distintos atributos al objeto de la clase cargador
    System.out.println("Introduce las caracteristicas de tu cargador: \n");
    System.out.println("Detalles del cable: \n");

    System.out.println("Introduce la entrada de tu cable (Ejemplo USB-A): ");
    entrada = Teclado.nextLine();

    System.out.println("Introduce la salida de tu cable (Ejemplo USB-C): ");
    salida = Teclado.nextLine();

    System.out.println("Permite el cable transferencia de datos por USB? (true/false): ");
    usb = Teclado.nextBoolean();

    // Añadimos el tipo de cable y su respectivo soporte USB a ArrayLists
    listaCables.add(entrada);
    listaCablesUSBData.add(usb);

    System.out.println("Introduce la longitud del cable (en m): ");
    longitud = Teclado.nextInt();

    System.out.println("Detalles del adaptador: \n");
    System.out.println("Introduce la potencia de entrada del cargador (en W): ");
    entradaPot = Teclado.nextInt();

    System.out.println("Introduce la potencia de salida del cargador (en W): ");
    salidaPot = Teclado.nextInt();

    System.out.println("Introduce el numero de puertos que tiene el adaptador (1/2): ");
    puerto = Teclado.nextInt();

    cargadorMovil = new Cargador(longitud, entrada, salida, usb, entradaPot, salidaPot, puerto);
    System.out.println(cargadorMovil);

    // Llamamos a un metodo de la clase Adaptador que contara los puertos disponibles
    // Teniendo en cuenta que si nuestro Adaptador tiene 1 puerto va a ser por defecto ocupado
    // Sino devolverá los puertos disponibles restantes según el maximo
    cargadorMovil.getAdaptadorUno().setPuertosDisponibles(listaCables);

    if (cargadorMovil.getAdaptadorUno().getPuertosDisponibles() > 0){
      System.out.println("\nPuertos disponibles para conectar un cable: " + cargadorMovil.getAdaptadorUno().getPuertosDisponibles()  + " puerto(s)");
    }

    // Según los cables creados anteriormente, consultamos un metodo de la clase cable
    // Que nos devolverá si alguno de nuestros cables es de
    // tipo 'micro usb' y además usa protocolo USB
    cargadorMovil.getCableUno().utilidadCables(listaCables, listaCablesUSBData);







  }
}
