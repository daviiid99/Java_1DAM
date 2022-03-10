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

public void setEstado(boolean estado){
	this.estado = estado;
}

public Ventana getVentana(){
	return this.ventanaPuerta;
}

public void abrir(){
	 this.setEstado(true);
}

public void cerrar(){
	this.setEstado(false);
}

public String toString (){
	String resultado = "Puerta : Cerrada";
	if (this.estado){
		resultado = "Puerta: Abierta";


	}
	resultado = ventanaPuerta + " | " + resultado;
	return resultado;

}


 }
