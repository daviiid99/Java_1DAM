import java.util.Scanner;

class Main {
 public static void main (String[] args){
 	Motor miMotor = new Motor();
 	Puerta miPuertaVentana = new Puerta();
 	Coche miCoche = new Coche();
  Ventana Ventana_Derecha_Coche = new Ventana();
  Scanner teclado = new Scanner(System.in);
  int preguntar;

 	/** miPuertaVentana.abrir();

 	miPuertaVentana.getVentana().abrir();
	System.out.println(miPuertaVentana.getEstado());
	System.out.println(miPuertaVentana.getVentana().getEstado());

	System.out.println(miMotor);
	miMotor.encender();
	System.out.println(miMotor);
	System.out.println(miPuertaVentana);
	*/


// Crea una clase Coche con un Motor y dos Puertas
// (Con ventana)
// Motor: encendido | PuertaI:{ Puerta: Abierta | Ventana: Abierta}| PuertaD{ Puerta: Abierta | Ventana: Abierta}

/**
	// Primero, encendemos el motor
	miCoche.getMotor().encender();

	// Segundo, abrimos ambas puertas
	miCoche.getPuertaI().abrir();
	miCoche.getPuertaD().abrir();

	// Tercero, abrimos ambas ventanas
	miCoche.getPuertaI().getVentana().abrir();
	miCoche.getPuertaD().getVentana().abrir();


	System.out.println(miCoche);

  // Devolvemos todo a default
  miCoche.getMotor().apagar();
  miCoche.getPuertaI().cerrar();
	miCoche.getPuertaD().cerrar();
  miCoche.getPuertaI().getVentana().cerrar();
  miCoche.getPuertaD().getVentana().cerrar();

  // Crea una clase Coche con un Motor y dos Puertas
  // (Con ventana)
  // Motor: encendido | PuertaI:{ Puerta: cerrada | Ventana: Abierta}| PuertaD{ Puerta: Abierta | Ventana: cerrada}

  // Comprobamos el estado del motor
  System.out.println(miMotor);

  // Encendemos el motor
  miCoche.getMotor().encender();

  // Segundo, abrimmos una de las puertas, la otra se quedará cerrada
  miCoche.getPuertaD().abrir();

  // Tercero, abrimos una ventana, la otra se quedará cerrada
  miCoche.getPuertaI().getVentana().abrir();

  // Imprimimos el toString con el resumen de todo los estados del coche
  System.out.println(miCoche);

    // Devolvemos todo a default
    miCoche.getMotor().apagar();
    miCoche.getPuertaI().cerrar();
  	miCoche.getPuertaD().cerrar();
    miCoche.getPuertaI().getVentana().cerrar();
    miCoche.getPuertaD().getVentana().cerrar();

    System.out.println(miCoche);

    // Ver como esta el motor
    // Ver como esta la ventana de la puerta derecha
    System.out.println(miCoche.getMotor());
    // Ver como esta la puerta derecha
    System.out.println(miCoche.getPuertaD());
    // Abrir la puerta puerta_derecha
	   miCoche.getPuertaD().abrir();
     System.out.println(miCoche);
     System.out.println(miCoche.getPuertaD());

     // Ver como esta la ventana de la puerta_derecha
     System.out.println(miCoche.getPuertaD().getVentana());

     // Abrimos la ventana
     miCoche.getPuertaD().getVentana().abrir();
     System.out.println(miCoche.getPuertaD().getVentana());

     // Queremos trabajar con la ventana puerta_derecha
     // Es mas comodo si la guardamos en una variable
     Ventana_Derecha_Coche = miCoche.getPuertaD().getVentana();
     Ventana_Derecha_Coche.abrir();
     System.out.println(Ventana_Derecha_Coche);
     Ventana_Derecha_Coche.cerrar();
     System.out.println(Ventana_Derecha_Coche);

     miCoche.abrirVentanaDerecha();
     System.out.println(miCoche);

     // Devolvemos todo a default
     miCoche.getMotor().apagar();
     miCoche.getPuertaI().cerrar();
  	 miCoche.getPuertaD().cerrar();
     miCoche.getPuertaI().getVentana().cerrar();
     miCoche.getPuertaD().getVentana().cerrar();
     */

     // Primero, vamos a llamar a nuestro Coche para ver todas nuestras nuevas puertas! Y sus ventanas!
     System.out.println("\n-------------------------------------------------");
     System.out.println(miCoche);
     System.out.println("-------------------------------------------------\n");

     // Ahora que tenemos todos los componentes
     // El siguiente paso es dar al usuario la opcion de abrir cada puerta
     System.out.printf("\nElige cual de las puertas de nuestro coche abrir\nEscribiendo un numero del 1 al 4 siguiendo el siguiente esquema:\n\nPuerta Delantera Izquierda: 1\nPuerta Delantera Derecha: 2\nPuerta Trasera Izquierda: 3\nPuerta Trasera Derecha: 4\n\nPuerta: ");
     preguntar = teclado.nextInt();

     // Ese valor se comparte con el metodo abrirPuertaUsuario de la clase coche
     miCoche.abrirPuertaUsuario(preguntar);

     // Imprimimos nuestro coche para comprobar su estado
     System.out.println("\n-------------------------------------------------");
     System.out.println(miCoche);
     System.out.println("-------------------------------------------------\n");


     // El siguiente paso es dar al usuario la opcion de abrir la ventana que desee
     System.out.printf("\nElige cual de las ventanas de nuestro coche abrir\nEscribiendo un numero del 1 al 4 siguiendo el siguiente esquema:\n\nVentana Puerta Delantera Izquierda: 1\nVentana Puerta Delantera Derecha: 2\nVentana Puerta Trasera Izquierda: 3\nVentana Puerta Trasera Derecha: 4\n\nVentana: ");
     preguntar = teclado.nextInt();

     // Ese valor se comparte con el metodo abrirVentanaUsuario de la clase coche
     miCoche.abrirVentanaUsuario(preguntar);

     // Imprimimos nuestro coche para comprobar su estado
     System.out.println("\n-------------------------------------------------");
     System.out.println(miCoche);
     System.out.println("-------------------------------------------------\n");

 }
}
