class Main {
 public static void main (String[] args){
 	Motor miMotor = new Motor();
 	Puerta miPuertaVentana = new Puerta();
 	Coche miCoche = new Coche();

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

 }
}
