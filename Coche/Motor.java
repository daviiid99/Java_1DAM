class Motor{
private boolean encendido;


public Motor(){
	this.encendido = false;
}

public boolean getEncendido(){
	return this.encendido;
}
	
public void setEncendido(boolean encendido){
	this.encendido = encendido;	
}

public void encender(){
	 this.setEncendido(true);
}

public void apagar(){
	this.setEncendido(false);
}

public String toString(){
	String resultado = "Motor: Apagado";

	if (this.encendido == true){
		resultado = "Motor: Encendido";


	}
	return resultado;
}
 
 }
