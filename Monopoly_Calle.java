import java.util.Random;
import java.util.Scanner;

enum Monopoly_Calle {
	CALLE_1("RONDA DE VALENCIA", "MARRON", 60, 0),
	CALLE_2("CALLE BRAVO MURILLO", "AZUL CIELO", 120, 0),
	CALLE_3("GLORIETA DE BILBAO", "PURPURA", 140, 0),
	CALLE_4("AVDA FELIPE II", "NARANJA", 180, 0),
	CALLE_5("AVENIDA DE AMERICA", "ROJA", 220, 0),
	CALLE_6("AVENIDA DE LOS REYES CATOLICOS", "AMARILLA", 260, 0),
	CALLE_7("PUERTA DEL SOL", "VERDE", 300, 0),
	CALLE_8("GRAN VIA", "VERDE", 320, 0),
	CALLE_9("PASEO DE LA CASTELLANA", "AZUL", 350, 0),
	CALLE_10("PASEO DEL PRADO", "AZUL", 400, 0);

	private String nombre;
	private String color;
	private int precio_venta;
	private int precio_alquiler;

	Monopoly_Calle(String nombre, String color, int precio_venta, int precio_alquiler){
		setNombre(nombre);
		setColor(color);
		setPrecioVenta(precio_venta);
		setPrecioAlquiler(precio_venta);
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setPrecioVenta(int precio_venta){
		this.precio_venta = precio_venta;
	}

	public void setPrecioAlquiler(int precio_venta){
		this.precio_alquiler = (precio_venta * 25) / 100;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getColor(){
		return this.color;
	}

	public int getPrecioVenta(){
		return this.precio_venta;
	}

	public int getPrecioALquiler(){
		return this.precio_alquiler;
	}

	public String toString(){
		return "\n------ Resumen Calle -----\nNombre : " + this.nombre + "\nColor : " + this.color + "\nPrecio Venta : " + this.precio_venta + "\nPrecio Alquiler : " + this.precio_alquiler;
	}




}

class Main {

	static Random rand = new Random();

  	public static void imprimirCalle(Monopoly_Calle calles[], int dados){
		dados = dados%10;
		Monopoly_Calle miCalle;
		miCalle = calles[dados] ;
		System.out.println(miCalle);
		//miCalle= Monopoly_Calle.valueOf(calle);
    	//System.out.println(miCalle);
						
  	}

	public static int tirar_Dados(int dado1, int dado2){
		dado1 = rand.nextInt((6 - 1)+1) + 1;
		dado2 = rand.nextInt((6 - 1)+1) + 1;

		return dado1 + dado2;
	}


	public static void main(String[] args) {
		Monopoly_Calle calles[] = Monopoly_Calle.values();
		String[] calles_Monopoly = {"", "", "", "", "", "", "", "", "", ""};
		int pos = 0;
		int dado1 = 0;
		int dado2 = 0;
		Scanner  scan = new Scanner(System.in);
		int user = 0;
		int posicion_jugador = 0;

		for (Monopoly_Calle cl : calles){
			System.out.println(cl.toString());
			calles_Monopoly[pos] = cl.getNombre();
			pos +=1;
			

		}

		System.out.println("----- Calles Monopoly -----\n");
		for (String cl : calles_Monopoly){
			System.out.println(cl);

		while (user !=99) {
			System.out.println("---- Menu de Juego------\n[1] Tirar dados");
			user = scan.nextInt();

			if (user == 1) {
				int tirar = tirar_Dados(dado1, dado2);
				System.out.println("Has sacado un " + tirar + " al tirar los dados");
				imprimirCalle(calles, tirar);
				
			}

		}

	}

}

}
	