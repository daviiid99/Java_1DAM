class Motocicleta {
	private Motor motorMotocicleta;
	//private Rueda ruedaDelantera, ruedaTrasera;
	private Deposito depositoMotocicleta;
	//private Espejo espejoIzquierdo, espejoDerecho;

	public Motocicleta(){
		this.motorMotocicleta = new Motor();
		//this.ruedaDelantera = new Rueda();
		//this.ruedaTrasera = new Rueda();
		this.depositoMotocicleta = new Deposito();
		//this.espejoDerecho = new Espejo();
		//this.espejoIzquierdo = new Espejo();

	}

	public Motor getMotor(){
		return this.motorMotocicleta;
	}

	/** public Rueda getRueda1(){
		return this.ruedaDelantera;
	}

	public Rueda getRueda2(){
		return this.ruedaTrasera;
	} */

	public Deposito getDeposito(){
		return this.depositoMotocicleta;
	}
	/**
	public Espejo getEspejo1(){
		return this.espejoDerecho;
	}

	public Espejo getEspejo2(){
		return this.espejoIzquierdo;
	} */

}