enum Color{
	AZUL(2),
	AMARILLO(1),
	VERDE(3),
	ROJO(1);
	// public static final color AZUL = new Color(2);
	private int numLapices;

	Color(int num){
		setNumLapices(num);
	}

	public int getNumLapices(){
		return  this.numLapices;
	}

	public void setNumLapices(int num){
		if (num >= 0) this.numLapices = num;
		else this.numLapices = 0;
	}
}