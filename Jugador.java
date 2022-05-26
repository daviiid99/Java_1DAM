class Jugador {
	// Nombre
	// Figura
	// Dinero
	// Posicion

	private String nombre;
	private String figura;
	private double dinero;
	private int posicion;

	Jugador(String nombre, String figura){
		setNombre(nombre);
		setFigura(figura);
		setDinero(0);
		setPosicion(0);
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setFigura(String figura){
		this.figura = figura;
	}

	public void setDinero(int dinero){
		this.dinero += dinero;
	}

	public void setPosicion(int posicion){
		this.posicion = posicion;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getFigura(){
		return this.figura;
	}

	public double getDinero(){
		return this.dinero;
	}

	public int getPosicion(){
		return this.posicion;
	}

	public String toString(){
		return "\n---- Datos del Jugador----\nNombre : " + this.nombre + "\nFigura : " + this.figura + "\nPosicion : " + this.posicion + "\nDinero : " + this.dinero;
	}

}
