import java.util.Scanner;
class Main {

	public static void imprimirBuffer(String[] buffer){
		System.out.print("|");
		for (String s : buffer){
			System.out.print(s);
			System.out.print(" | ");
		}
		System.out.println("");
	}

	public static void escribir(String[] buffer, int posicion, String nota ){
		posicion = posicion % 15;
		buffer[posicion] = nota;
	}

	public static void leer(String[] buffer, int posicion){
		posicion = posicion % 15;
		System.out.println(buffer[posicion]);

	}


	public static void main(String[] args) {
		String[] buffer = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
		Scanner scan = new Scanner(System.in);
		String ask = "empezar";
		int posicion_escribir = 0;
		int posicion_leer = 0;
		int posicion_anterior = 0;
		

		// Con While true nunca nos salimos del bucle
		while (true) { 
			System.out.println("\n¿Que hacer? \n(LEER | ESCRIBIR | MOSTRAR)");
			ask = scan.nextLine();

			if (ask.equals("ESCRIBIR")){
				System.out.println("Que quieres introducir : \n");
				ask = scan.nextLine();
				System.out.println(posicion_escribir);
				escribir(buffer, posicion_escribir, ask);
				posicion_escribir +=1;

			}
			
			else if (ask.equals("LEER")) {

				if (posicion_leer < posicion_escribir){
					leer(buffer, posicion_leer);
					posicion_leer +=1;

				} else {
					System.out.println("No puedes leer una posicion sin escribir!");
				}
			}

			else if (ask.equals("MOSTRAR")){
				imprimirBuffer(buffer);	

			}		

			else {
				System.out.println("Debe introducir un valor valido");
			}


		}


		
	}

}