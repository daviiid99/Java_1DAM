class Ventana{
private boolean abierta;


public Ventana(){
	this.abierta = false;
}

public boolean getEstado(){
	return this.abierta;
}

public void abrir(){
	 this.abierta = true;
}

public void cerrar(){
	this.abierta = false;
}

public String toString (){
	String resultado = "Ventana : Cerrada";
	if (this.abierta == true){
		resultado = "Ventana: Abierta";


	}
	return resultado;

}
 
 }
