import java.util.Scanner;

enum Transporte {
	AVION(900,10), 
	TREN(200, 14),
	COCHE(120, 12),
	BICICLETA(20,0);

	private double velocidad;
	private double precio_cada_100;

	// espacio = velocidad/tiempo
	// tiempo = distancia/velocidad

	Transporte(double velocidad, double precio_cada_100){
		this.velocidad = velocidad;
		setPrecio(precio_cada_100);
	}

	public void setPrecio(double precio){
		this.precio_cada_100 = precio;
	}

	public double getPrecio(){
		return this.precio_cada_100;
	}

	public double getVelocidad(){
		return this.velocidad;
	}

	public double precio_final(double kilometros_total){
		return Math.round(((kilometros_total * precio_cada_100) /100)*100.0)/100.0;

	}

	public double llegar_destino(double kilometros_total){
		double tiempo = kilometros_total/velocidad;
		double tiempo_Espera = 1;
		if (name().equals("AVION") ) tiempo+=tiempo_Espera;		
		return Math.round((tiempo*100.0)/100.0);
	}



}

class Main{
	public static String ResumenVehiculo(String vehiculo, double precio, double tiempo){
		return "-----Nombre Vehiculo------ " + "\nNombre : " + vehiculo + "\nImporte trayecto : " + precio + " €" + "\nTiempo trayecto : " + tiempo + " h";

	}

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		Transporte vehiculoUno = Transporte.valueOf("COCHE");;
		String ask;
		double precio_Vel;
		Transporte miVehiculo;
		Transporte vehiculos;
        Transporte arrayVehiculos[] = Transporte.values();

        // Inicializo la variable ask vacia
		ask = "";

		// Pregunto por teclado por uno de los vehiculos disponibles
		System.out.println("Selecciona tu vehiculo entre los siguientes : \n----------------------------");
		for ( Transporte v : arrayVehiculos)
			System.out.println(v);
		System.out.println("----------------------------\n");

		ask = scan.nextLine();

		// Pregunto por la distancia total que se va a recorrer en ese vehiculo
		System.out.println("Selecciona el trayecto final : \n ");
		precio_Vel = scan.nextDouble();

		// Inicializo un par de variables para usar luego
		double ask_km = 0;
		double ask_vel = 0;
		
		// Le doy a mivehiculo un valor del enum por teclado
		miVehiculo =  Transporte.valueOf(ask.toUpperCase());

		// Llamamos a las funciones
		ask_km = miVehiculo.precio_final(precio_Vel);
		ask_vel = miVehiculo.llegar_destino(precio_Vel);

		// Llamamos a un metodo que devuelve un resumen del trayecto
		System.out.println(ResumenVehiculo(ask.toUpperCase(), ask_km, ask_vel ));


	}
}