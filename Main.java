import java.util.Scanner ;
import java.util.ArrayList;

class Main {

	public static void menuTarjetas(Scanner scan){
		ArrayList<Tarjeta> misTarjetas = new ArrayList<Tarjeta>();
		ArrayList<String> preguntas = new ArrayList<String>();
		Tarjeta miTarjeta;
		String pregunta = "";
		String respuesta = "";
		int puntos = 0 ;
		double puntuacion_mia = 0.0;
		double puntuacion_total = 0.0;
		double puntuacion = 0.0;
		int puntos_totales = 0;
		int acertadas = 0;
		boolean choose = true;
		String choosing = "";
		boolean hasAprobado = false;

		while (choose){
			System.out.println("""
				VERSIÓN 1.0:
				¿Qué quieres hacer?
				1. Crear una tarjeta.
				2. Mostrar todas las tarjetas.
				3. Mostrar todas las tarjetas que valgan más de 1 punto.
				4. Mostrar pregunta aleatoria.
				5. EXAMEN
				6. Volver al menú inicial.
				""");

			choosing = scan.nextLine();

			if ( choosing.equals("1") ){

				// Preguntamos los datos para crear una tarjeta
				System.out.println("Introduce tu pregunta : ");
				pregunta = scan.nextLine();

				System.out.println("Introduce tu respuesta : ");
				respuesta = scan.nextLine();

				System.out.println("Introduce la puntuacion : ");
				puntos = Integer.parseInt(scan.nextLine());

				// Creamos una tarjeta con la clase
				miTarjeta = new Tarjeta(pregunta, respuesta, puntos);

				// Guardamos la  tarjeta en la lista
				misTarjetas.add(miTarjeta);

			} else if (choosing.equals("2")){
				for (Tarjeta t : misTarjetas){
					System.out.println(t);
				}
			} else if (choosing.equals("3")){

				for (Tarjeta t : misTarjetas){
					if (t.getPuntos() > 1){
						System.out.println(t);
						}
					}
			} else if (choosing.equals("4")){
				for (int i = 0; i < misTarjetas.size(); i++){
					int index = (int)(Math.random() * misTarjetas.size());
					miTarjeta = misTarjetas.get(index);
					System.out.println(miTarjeta.getPregunta());
					choosing = scan.nextLine();
					System.out.println(miTarjeta.getRespuesta());


				}
			} else if (choosing.equals("5")){
				hasAprobado = false;
			
				for (int i = 0; i < 3; i ++){
					int index = (int)(Math.random() * misTarjetas.size());
					miTarjeta = misTarjetas.get(index);
					System.out.println(miTarjeta.getPregunta());
					respuesta = scan.nextLine();
					puntos_totales += miTarjeta.getPuntos();
					if (miTarjeta.getRespuesta().equals(respuesta)){
						puntos += miTarjeta.getPuntos();
						acertadas +=1;
					}
				
			}
			
			puntuacion_mia = puntos;
			puntuacion_total = puntos_totales;
	
			if ((puntuacion_mia / puntos_totales)> 0.5 ){
				hasAprobado = true;

			if (hasAprobado == true){
				System.out.println(puntuacion_mia/puntuacion_total);
				System.out.println(puntuacion_mia);
				System.out.println(puntuacion_total);
				System.out.println("Has acertado" + acertadas + "/3," + " tienes un " + puntos + "  ¡¡¡Has aprobado!!! :)");
			} else {
				System.out.println("Has acertado" + acertadas + "/3," + " tienes un " + puntos + " ¡¡¡Has suspendido!!! :(");

			}
			puntuacion_mia = 0.0;
				puntuacion_total = 0.0;
				puntuacion = 0.0;
				puntos = 0;
				acertadas = 0;
			}
			

			} else if (choosing.equals("6")){
				choose = false;

			}

			}

			}
			


	
	public static void main(String[] args) {
		boolean choose = true;
		int choosing = 0;
		Scanner scan = new Scanner(System.in);
		
		while (choose){
			System.out.println("""
				MENÚ INICIAL:
				1. Acceder a la versión 1.0 - Recuperación - del programa.
				2. Acceder a la versión 2.0 - Subida de nota - del programa.
				3. SALIR
			""");

			try {
				choosing = scan.nextInt();
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("\nDebes introducir la opción 1, 2 o 3");
				choosing = scan.nextInt();
				continue;


			}

			if (choosing == 1){
				menuTarjetas(scan);

			} else if (choosing == 2){
				System.out.println("Esta versión está en construcción");
			}

			else if (choosing  == 3){
				choose = false;
			}
		}
	}
}