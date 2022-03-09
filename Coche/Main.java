class Main {
 public static void main (String[] args){
 	Motor miMotor = new Motor();
 	Ventana miVentana = new Ventana();
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


	// Primero, encendemos el motor
	miCoche.getMotor().encender();

	// Segundo, abrimos ambas puertas
	miCoche.getPuertaI().abrir();
	miCoche.getPuertaD().abrir();

	// Tercero, abrimos ambas ventanas
	miCoche.getPuertaI().getVentana().abrir();
	miCoche.getPuertaD().getVentana().abrir();


	System.out.println(miCoche);

 }
}

// Crea una clase Coche con un Motor y dos Puertas 
// (Con ventana)

// Solo necesitas implementar los getter y el method toString
// Motor: encendido | PuertaI:{ Puerta: Abierta | Ventana: Abierta}| PuertaD{ Puerta: Abierta | Ventana: Abierta} 