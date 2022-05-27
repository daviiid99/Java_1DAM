import java.util.Random;
import java.util.Scanner;

class Jugador {
	private int contador;

	Jugador(){
		setContador(0);
	}

	public void setContador(int contador){
		this.contador += contador;
	}

	public int getContador(){
		return this.contador;
	}

	public String toString(){
		return "----- Datos Jugador------\nContador : " + this.contador;
	}
}

class Main{

	public static String moneda(){
		Random random = new Random();
		String[] moneda = {"cara", "cruz"};
		int elementos = random.nextInt(moneda.length);
		return moneda[elementos];

	}

	public static void jugar(Jugador jugador1, Jugador jugador2){
		Scanner scan = new Scanner(System.in);
		int user = 0;
		int turno = 0;
		String elige = "";
		String ia = "";
		String toca = "";
		int[] pos;
		Tablero tableroEjemplo = new Tablero();
		Tablero tableroFichas = new Tablero();
		tableroEjemplo.rellenarMatrizNumeros();
		tableroFichas.rellenarMatrizPosicion();


		

		System.out.println("\nCara o Cruz? ");
		elige = scan.nextLine();
		ia = moneda();

		if (elige == ia){
			turno = 0;
			

		} else {
			turno+=1;
		}

		while (user != 99){

			if (jugador1.getContador() >= 10){
					user = 99;
				}

			if (jugador2.getContador() >= 10){
					user = 99;
				}


			if (turno%2 == 0){
				
				System.out.println("Es el turno del jugador 1\n");
				tableroEjemplo.imprimir_ejemplo();
				tableroEjemplo.imprimir();
				System.out.println("\nElige una posicion del tablero superior");
				user = scan.nextInt();
				toca = tableroFichas.queHay(user);
				pos = tableroFichas.donde(user);
				tableroEjemplo.rellenar(pos[0], pos[1], toca  );
				turno+=1;

				if (toca.equals("DIAMANTE")){
					jugador1.setContador(5);


				} else if (toca.equals("ORO")){
					jugador1.setContador(3);

				} else if (toca.equals("PLATA")){
					jugador1.setContador(2);
				} else if (toca.equals("NADA")){
					jugador1.setContador(0);
				} else {
					jugador1.setContador(-3);
				}

				System.out.println("\nJUGADOR 2 :\n" + jugador1);
				
				

			}

			else if (turno%2 == 1){
				
				System.out.println("Es el turno del jugador 2\n");
				tableroEjemplo.imprimir_ejemplo();
				tableroEjemplo.imprimir();
				System.out.println("\nElige una posicion del tablero superior");
				user = scan.nextInt();
				toca = tableroFichas.queHay(user);
				pos = tableroFichas.donde(user);
				tableroEjemplo.rellenar(pos[0], pos[1], toca  );
				turno+=1;

				if (toca.equals("DIAMANTE")){
					jugador2.setContador(5);


				} else if (toca.equals("ORO")){
					jugador2.setContador(3);

				} else if (toca.equals("PLATA")){
					jugador2.setContador(2);
				} else if (toca.equals("NADA")){
					jugador2.setContador(0);
				} else {
					jugador2.setContador(-3);
				}

				System.out.println("\nJUGADOR 2 :\n" + jugador2);

			}
			

		}
		

	}

	public static void main(String[] args) {
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();

		// Empezamos la partida
		jugar(jugador1, jugador2);
		


	}
}