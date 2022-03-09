class Ventana{
private boolean abierta;


public Ventana(){
	this.abierta = false;
}

public boolean getEstado(){
	return this.abierta;
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
	if (this.abierta == true){
		resultado = "Ventana: Abierta";


	}
	return resultado;

}
 
 }
