import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		Motocicleta miMoto = new Motocicleta();
		Deposito depositoMoto = new Deposito();
		Motor motorMoto = new Motor();
		float preguntar, preguntar2;

		System.out.println("Introduce la capacidad TOTAL de tu vehiculo: \n");
		preguntar = teclado.nextFloat();
		System.out.println("Introduce la capacidad ACTUAL de tu vehiculo: \n");
		preguntar2 = teclado.nextFloat();

		depositoMoto = new Deposito(preguntar, preguntar2);
		depositoMoto.medirCapacidad(preguntar2);

		while (depositoMoto.getCapacidad() != true){
			System.out.println("La capacidad de tu vehiculo no es optima\nIntroduce un importe en euros para rellenar: \n");
			preguntar = teclado.nextFloat();
			depositoMoto.llenarDeposito(preguntar);
		}

		miMoto.getMotor().encender();
		System.out.println(miMoto.getMotor());

		// Primero, necesitamos comprobar el estado del deposito
		// Le vamos a pasar nuestra capacidad actual

		// Segundo, mientras esa capacidad no nos devuelva un true
		// Significa que tenemos que repostar

		// Entonces, por teclado introducimos el importe que queremos gastar en gasolina
		// Y se encargara de convertir los euros a litros y rellenar hasta que este minimo medio



	}

}