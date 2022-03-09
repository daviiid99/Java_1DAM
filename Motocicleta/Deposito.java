class Deposito{
	private float capacidad, capacidad_Actual, importe;
	private float deposito_Lleno, deposito_Medio, deposito_Reserva, deposito_Vacio;
	private boolean estado;
	private float precioGasolina;

	public Deposito(){
		this.capacidad = 13;
		this.capacidad_Actual = capacidad_Actual;
		this.deposito_Lleno = this.capacidad;
		this.deposito_Medio = this.capacidad/2;
		this.deposito_Reserva = this.capacidad/3;
		this.deposito_Vacio = 0;
		this.precioGasolina = 2;
		this.importe = importe;
		this.estado = false;
	}

	public Deposito(float total, float actual){
		this.capacidad = total;
		this.capacidad_Actual = actual;
		this.deposito_Lleno = this.capacidad;
		this.deposito_Medio = this.capacidad/2;
		this.deposito_Reserva = this.capacidad/3;
		this.deposito_Vacio = 0;
		this.precioGasolina = 2;
		this.importe = importe;
		this.estado = false;
	}

	public boolean getCapacidad(){
		return this.estado;
	}

	public void setCapacidad(boolean estadoDeposito){
		this.estado = estadoDeposito;
	}

	public void medirCapacidad(float capacidadActual){
		if ( capacidadActual == this.deposito_Lleno ){
			setCapacidad(true);
		}

		if ( capacidadActual < this.deposito_Lleno && capacidadActual >= this.deposito_Medio){
			setCapacidad(true);
		} 

		if ( capacidadActual < this.deposito_Medio && capacidadActual >= this.deposito_Reserva ){
			setCapacidad(false);
		}

		else if ( capacidadActual < this.deposito_Reserva || capacidadActual == deposito_Vacio) {
			setCapacidad(false);
		}


	}

	public void llenarDeposito(float importe){
		for ( int i = 0; importe > 0 && capacidad_Actual <= capacidad; i+=2){
			importe -=i;
			capacidad_Actual+=1;

		}

		medirCapacidad(capacidad_Actual);


	}


}