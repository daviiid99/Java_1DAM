class Tarjeta {
	private String pregunta;
	private String respuesta;
	private int puntos;

	public Tarjeta(String pregunta, String respuesta, int puntos){
		setPregunta(pregunta);
		setRespuesta(respuesta);
		setPuntos(puntos);
	}

	public void setPregunta(String pregunta){
		this.pregunta = pregunta;
	}

	public void setRespuesta(String respuesta){
		this.respuesta = respuesta;
	}

	public void setPuntos(int puntos){
		this.puntos = puntos;
	}

	public String getPregunta(){
		return this.pregunta;
	}

	public String getRespuesta(){
		return this.respuesta;
	}

	public int getPuntos(){
		return this.puntos;
	}

	public String toString(){
		return "--------------\nTarjeta\n--------------\nPregunta : " + this.pregunta + "\nRespuesta :" + this.respuesta + "\nPuntos : " + this.puntos;
	}

}
