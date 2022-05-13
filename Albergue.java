import java.util.Scanner;

enum Albergue{
	SIMPLES(1, 50, 5),
	DOBLES(2, 80, 0),
	TRIPLES(3,100, 3),
	MULTIPLES(6,150, 4);

	private int numero_personas;
	private double precio_habitacion;
	private int numero_noches;
	private int habitaciones_disponibles;

	Albergue (int numero_personas, double precio_habitacion, int habitaciones_disponibles){
		this.numero_personas = numero_personas;
		this.precio_habitacion = precio_habitacion;
		this.habitaciones_disponibles = habitaciones_disponibles;
	}

	public int getNumeroPersonas(){
		return this.numero_personas;
	}

	public double getPrecioHabitacion(){
		return this.precio_habitacion;
	}

	public int getHabitacionesDisponibles(){
		return this.habitaciones_disponibles;
	}

	public double precio_por_noche(int noches){
		return (precio_habitacion * noches);

	}

	public double descuentoPorMolestia(double precio){
		return precio - (precio*15)/100 ;
	}

	public double precio_por_persona(int noches, int personas){
		return (precio_habitacion * noches)/personas;

	}

	public double precio_por_persona_descuento(int noches, int personas){
		return ((precio_habitacion * noches) - (precio_habitacion*15)/100 ) /personas;

	}
}

class Main{

	public static String ResumenCompra(double precio_total, double precio_por_persona){
        return "----- Resumen Alojamiento -----\nCoste ALojamiento : " + precio_total + "\nCoste alojamiento por persona : " + precio_por_persona;
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String habitacion; // Preguntamos
		int personas; // Preguntamos
		int noches; // preguntamos
		String personas_temp;
		String noches_temp;
		double descuento;
		double descuento_por_persona;

		System.out.println("DAVID MOLINA MORALES\n");


		// Declaramos la variable de tipo albergue
		Albergue miHabitacion;

		// Vamos a recopilar todas las habitaciones que hay
		Albergue tipos[] = Albergue.values();

		// Preguntamos
		System.out.println("\nQue tipo de albergue quiere de los disponibles : \n");

		// Mostramos por pantalla todos los ALbergues que hay
		for (Albergue al : tipos) System.out.println(al);

		habitacion = scan.nextLine();


		// Almacenamos el tipo
		miHabitacion = Albergue.valueOf(habitacion.toUpperCase());

		// Preguntamos por cuantas personas son
		personas = 999; // Inicializamos

		while (miHabitacion.getNumeroPersonas() < personas) {
			System.out.println("\nCuantas personas son :  \n");
			personas_temp = scan.nextLine();
			personas =  Integer.valueOf(personas_temp);
		}
		
		// Preguntamos cuantas noches se va a quedar
		System.out.println("\nCuantas noches se va a quedar : \n");
		noches_temp = scan.nextLine();
		noches =  Integer.valueOf(noches_temp);

		// Vamos a generar un resumen de la compra
		System.out.println(ResumenCompra(miHabitacion.precio_por_noche(noches), miHabitacion.precio_por_persona(noches, personas)));

		// Vamos a comprobar si nos quedan habitaciones
		System.out.println("\nNuestro sistema esta comprobando si existen plazas para la habitacion seleccionada : ...\n");

		if (miHabitacion.getHabitacionesDisponibles() == 0){
			System.out.println("\nLamentablemente, no podemos ofrecerte esa habitacion...\nEstamos comprobamos otras en nuestro almacen\n");

			for (Albergue al : tipos) {
				System.out.println("\nTipo Habitacion : " + al + "\nHabitaciones Disponibles : " + al.getHabitacionesDisponibles());
			}

			habitacion = scan.nextLine();
			miHabitacion = Albergue.valueOf(habitacion.toUpperCase());
			descuento = miHabitacion.descuentoPorMolestia(miHabitacion.precio_por_noche(noches));
			descuento_por_persona = miHabitacion.precio_por_persona_descuento(noches, personas);
			// Vamos a generar un nuevo resumen de la compra;
			System.out.println(ResumenCompra(descuento, descuento_por_persona));

		} else {
			System.out.println("\nEstas de suerte, quedan plazas!");
		}




	}
}