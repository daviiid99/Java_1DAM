class Motor{
private boolean estado;


public Motor(){
	this.estado = false;
}

public boolean getEstado(){
	return this.estado;
}

public void setEstado(boolean estado){
	this.estado = estado;
}

public void encender(){
	 this.setEstado(true);
}

public void apagar(){
	this.setEstado(false);
}

public String toString(){
	String resultado = "Motor: Apagado";

	if (this.estado){
		resultado = "Motor: Encendido";


	}
	return resultado;
}

 }
