class Coche{
private Motor motorCoche;
private Puerta puerta_izquierda;
private Puerta puerta_derecha;
private Puerta puerta_trasera_izquierda;
private Puerta puerta_trasera_derecha;

public Coche(){
	this.motorCoche = new Motor();
	this.puerta_derecha = new Puerta();
	this.puerta_izquierda = new Puerta();
	this.puerta_trasera_izquierda = new Puerta();
	this.puerta_trasera_derecha = new Puerta();
}


public Puerta getPuertaI(){
	return this.puerta_izquierda;
}

public Puerta getPuertaD(){
	return this.puerta_derecha;
}

public Puerta getPuertaTI(){
	return this.puerta_trasera_izquierda;
}

public Puerta getPuertaTD(){
	return this.puerta_trasera_derecha;
}

public Motor getMotor(){
	return this.motorCoche;
}

public void abrirVentanaDerecha(){
	this.puerta_derecha.getVentana().abrir();

}

public void abrirPuertaUsuario(int numero){
	if ( numero == 1){
		this.getPuertaI().abrir();
		System.out.println("Puerta Delantera Izquierda cambio su estado a: Abierta");
	}

	if ( numero == 2){
		this.getPuertaD().abrir();
		System.out.println("\n!!Puerta Delantera Derecha cambio su estado a: Abierta!!\n");
	}

	if ( numero == 3){
		this.getPuertaTI().abrir();
		System.out.println("\n!!Puerta Trasera Izquierda cambio su estado a: Abierta!!\n");
	}

	if ( numero == 4){
		this.getPuertaTD().abrir();
		System.out.println("\n!!Puerta Trasera Derecha cambio su estado a: Abierta!!\n");
	}

	else if (numero >= 5 || numero < 1) {
			System.out.println("\n!!Indico una puerta no existente... Nada ocurrio!!\n");
		}

}

public void abrirVentanaUsuario(int numero){
	if (numero == 1){
		this.getPuertaI().getVentana().abrir();
		System.out.println("\n!!Ventana Delantera Izquierda cambio su estado a: Abierta!!\n");
	}

	if (numero == 2){
		this.getPuertaD().getVentana().abrir();
		System.out.println("\n!!Ventana Delantera Derecha cambio su estado a: Abierta!!\n");
	}

	if (numero == 3){
		System.out.println("\n!!Error: Ventana Trasera Izquierda detecto un intento de apertura:\nAccion no permitida!!\n");
	}

	if (numero == 4){
		System.out.println("\n!!Error: Ventana Trasera Izquierda detecto un intento de apertura:\nAccion no permitida!!\n");
		}

	else if (numero >= 5 || numero < 1) {
    System.out.println("\n!!Indico una ventana no existente... Nada ocurrio!!\n");
		}

}

public String toString(){
	return "Resumen detallado del estado de tu vehiculo\n-------------------------------------\n" + motorCoche + "\n" + "PuertaI: | " + puerta_izquierda + "|" + "\n" + "PuertaD: | " + puerta_derecha + "|" + "\n" + "Puerta Trasera Izquierda: |" + this.puerta_trasera_izquierda +"|" + "\n" + "Puerta Trasera Derecha:|" + this.puerta_trasera_derecha;
}

}
