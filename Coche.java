class Coche{
private Motor motorCoche;
private Puerta puerta_izquierda;
private Puerta puerta_derecha;

public Coche(){
	this.motorCoche = new Motor();
	this.puerta_derecha = new Puerta();
	this.puerta_izquierda = new Puerta();
}


public Puerta getPuertaI(){
	return this.puerta_izquierda;
}

public Puerta getPuertaD(){
	return this.puerta_derecha;
}

public Motor getMotor(){
	return this.motorCoche;
}

public String toString(){
	return motorCoche + "|" + "PuertaI:{ " + puerta_izquierda + "}" + "|" + "PuertaD:{ " + puerta_derecha + "}";
}


}