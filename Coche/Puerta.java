class Puerta{
private boolean estado;
private Ventana ventanaPuerta;


public Puerta(){
	this.estado = false;
	this.ventanaPuerta = new Ventana();
}

public boolean getEstado(){
	return this.estado;
}

public Ventana getVentana(){
	return this.ventanaPuerta;
}

public void abrir(){
	 this.estado = true;
}

public void cerrar(){
	this.estado = false;
}

public String toString (){
	String resultado = "Puerta : Cerrada";
	if (this.estado == true){
		resultado = "Puerta: Abierta";


	}
	resultado = ventanaPuerta + " | " + resultado;
	return resultado;

}


 }
