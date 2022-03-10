class Ventana{
private boolean estado;


public Ventana(){
	this.estado = false;
}

public boolean getEstado(){
	return this.estado;
}

private void setEstado(boolean estado){
	 this.estado = estado;
}

public void abrir(){
	this.setEstado(true);
	//this.abierta = true;
}

public void cerrar(){
	this.setEstado(false);
}

public String toString (){
	String resultado = "Ventana : Cerrada";
	if (this.estado){
		resultado = "Ventana: Abierta";


	}
	return resultado;

}

 }
