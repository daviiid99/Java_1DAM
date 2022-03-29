import java.util.ArrayList;
import java.util.Scanner;

class Main{
public static void main(String[] args) {
ArrayList<Integer> dimensiones = new ArrayList<>();
Scanner Teclado = new Scanner(System.in);
// Objetos de la clase Mueble
Mueble miMueble = new Mueble();
Mueble miMuebleParametros = new Mueble();
// Objetos de la clase Mesa
Mesa mesaDefecto = new Mesa();
Mesa mesaComedor = new Mesa();
//Objetos de la clase Armario
Armario armarioDefecto = new Armario();
Armario armarioDormitorio = new Armario();
String material;
int ancho;
int altura;
int profundidad;
int numero_patas;
boolean tipo_mueble;
int numero_baldas;
String tipo_puerta;

/**
Este bloque incluye a los objetos de la clase Mueble
*/
System.out.println("---------Mueble comun------------");
System.out.println("Introduce el material de tu mueble: \n");
material = Teclado.nextLine();
System.out.println("Introduce las dimensiones de tu mueble:\n");
System.out.print("Ancho: ");
ancho = Teclado.nextInt();
dimensiones.add(ancho);
System.out.print("Profundidad: ");
profundidad = Teclado.nextInt();
dimensiones.add(profundidad);
System.out.print("Altura: ");
altura = Teclado.nextInt();
dimensiones.add(altura);
System.out.println("Es tu mueble un Armario?: (true/false)");
tipo_mueble = Teclado.nextBoolean();

miMuebleParametros = new Mueble(material, dimensiones,tipo_mueble );

System.out.println("Mueble por defecto");
System.out.println(miMueble);
System.out.println("\n");
System.out.println("Mueble por parametros");
System.out.println(miMuebleParametros);

System.out.println("\n--------Comprobamos con sets y gets------------");
miMuebleParametros.setMaterial(material);
System.out.println(miMuebleParametros.getMaterial());
miMuebleParametros.setDimensiones(ancho, altura, profundidad);
System.out.println(miMuebleParametros.getDimensiones());
System.out.println(miMuebleParametros);

miMuebleParametros.setDimensiones(dimensiones);
System.out.println(miMuebleParametros);


/**
Este bloque incluye a los objetos de la clase Mesa
*/
System.out.println("\n---------Mesa------------");
System.out.println("\n---------Mesa por defecto------------");
System.out.println(mesaDefecto);
System.out.println("Introduce el material de tu mueble: \n");
material = Teclado.nextLine();
System.out.println("Introduce las dimensiones de tu mueble:\n");
System.out.print("Ancho: ");
ancho = Teclado.nextInt();
dimensiones.add(ancho);
System.out.print("Profundidad: ");
profundidad = Teclado.nextInt();
dimensiones.add(profundidad);
System.out.print("Altura: ");
altura = Teclado.nextInt();
dimensiones.add(altura);
System.out.println("Numero Patas: ");
numero_patas = Teclado.nextInt();
System.out.println("Es tu mueble un Armario?: (true/false)");
tipo_mueble = Teclado.nextBoolean();

System.out.println("\n---------Mesa con valores------------");
mesaComedor = new Mesa(numero_patas, material, ancho, profundidad, altura, tipo_mueble);
System.out.println(mesaComedor);

System.out.println("\n--------Comprobamos con sets y gets------------");
mesaComedor.setPatas(10);
System.out.println(mesaComedor.getPatas());
System.out.println(mesaComedor);

/**
Este bloque incluye a los objetos de la clase Armario
*/
System.out.println("\n---------Armario------------");
System.out.println("---------Armario por defecto--------");
System.out.println(armarioDefecto);
System.out.println("Introduce el material de tu mueble: \n");
material = Teclado.next();
System.out.print("Que tipo de puerta tiene tu mueble?: \n");
tipo_puerta = Teclado.next();
System.out.print("Introduce las dimensiones de tu mueble:\n");
System.out.println("Ancho: ");
ancho = Teclado.nextInt();
dimensiones.add(ancho);
System.out.println("Profundidad: ");
profundidad = Teclado.nextInt();
dimensiones.add(profundidad);
System.out.println("Altura: ");
altura = Teclado.nextInt();
dimensiones.add(altura);
System.out.println("Cuantas baldas tiene tu mueble?: ");
numero_baldas = Teclado.nextInt();
System.out.println("Es tu mueble un Armario?: (true/false)");
tipo_mueble = Teclado.nextBoolean();


System.out.println("---------Armario con valores--------");
armarioDormitorio = new Armario(material, ancho, profundidad, altura, tipo_puerta, numero_baldas, tipo_mueble );
System.out.println(armarioDormitorio);

System.out.println("\n--------Comprobamos con sets y gets------------");
armarioDormitorio.setTipoPuertas("deslizable");
System.out.println(armarioDormitorio.getTipoPuertas());

armarioDormitorio.setNumeroBaldas(10);
System.out.println(armarioDormitorio.getNumeroBaldas());
System.out.println(armarioDormitorio);


}
}
