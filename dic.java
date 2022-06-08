import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.*;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Declaramos un scanner

		// Creamos el HashMap
		HashMap<String, Integer> pokemon = new HashMap<String, Integer>();
		String[] lista = new String[3];

		// Rellenamos el HashMap

		pokemon.put("Squirtle", 15);
		pokemon.put("Bulbasaur", 15);
		pokemon.put("Charmander", 16);
		pokemon.put("Pikachu", 11);

		// Imprimimos el diccionario
		System.out.println("--- Diccionario Estado Inicial ----");
		System.out.println(pokemon);

		// Borramos un elemento del diccionario
		pokemon.remove("Pikachu"); // Se le pasa la clave como indice

		// Volvemos a imprimir el diccionario
		System.out.println("---- Diccionario Tras Borrado");
		System.out.println(pokemon);

		// Imprimimos por separados keys y values

		// Keys
		System.out.println("--- Claves del Diccionario");
		System.out.println(pokemon.keySet());

		// Values
		System.out.println("--- Valores del Diccionario");
		System.out.println(pokemon.values());

		// Creamos un Set con las claves
		Set<String> claves = new HashSet<String>();
		claves = pokemon.keySet();

		// Lo convertimos a array
		claves.toArray(lista);

		// Imprimimos el set
		System.out.println("--- Set con las claves ---");
		System.out.println(claves);

		for (int i  = 0; i < lista.length; i ++){

			System.out.println(pokemon.get(lista[i]));
			if (pokemon.get(lista[i]) == 15) pokemon.remove(lista[i]);
		}

		// Imprimimos el diccionario tras modificarlo
		System.out.println("Hemos borrados los pokemon con nivel 15");
		System.out.println(pokemon);









		
	}
}