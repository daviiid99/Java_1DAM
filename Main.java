import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{

  public int SilvestreMataGallinas(int numero_gallinas, ArrayList<Integer> listaDecesos, Scanner Teclado){
    int decesos = 0;
    int contador = 0;
    for (int i = 0; contador <= numero_gallinas && decesos != -1; i ++ ){
      contador +=decesos;
      decesos = SolicitarGallinas(Teclado);
      numero_gallinas-=decesos;
      listaDecesos.add(decesos);
    }
    return decesos;
  }

  public int SolicitarGallinas(Scanner Teclado){
    int decesos;
    System.out.print("Cuantas gallinas ha matado nuestro Silvestre? : ");
    decesos = Teclado.nextInt();
    return decesos;
  }

  public static void main(String[] args) {
    Main mataGallinas = new Main();
    Animal miAnimalFantastico = new Animal();
    Animal miAnimalPreshistorico = new Animal();
    Zorro miZorroDefecto = new Zorro();
    Zorro zorritoAdorable = new Zorro();
    Gallina miGallinaDefecto = new Gallina();
    Gallina turuleca = new Gallina();
    Scanner Teclado = new Scanner(System.in);
    ArrayList<Integer> listaDecesos = new ArrayList<>();
    int gallinas;
    int zorros;
    int decesos;
    int gallinas_disponibles;

    // Constructor por defecto de Animal
    System.out.println(miAnimalFantastico + "\nQue come el animal?: " + miAnimalFantastico.getComidaAnimal() + "\nChiste: " + miAnimalFantastico.getChisteAnimal());

    // Constructor por defecto de Zorro
    System.out.println(miZorroDefecto);

    // Constrcutor de zorro con valores
    zorritoAdorable = new Zorro("Es un zorro", 1, "Gallinas al horno", 4,  0);
    zorritoAdorable.OtroDiaMas();
    System.out.println(zorritoAdorable);

    // Constructor de Gallina por defecto
    System.out.println(miGallinaDefecto);

    // Constructor de Gallina con valores
    turuleca.setHuevosPorDia(10);
    System.out.println(turuleca.getHuevosPorDia());
    turuleca.setDiasPoniendo(30);
    System.out.println(turuleca.getDiasPoniendoHuevos());
    turuleca.CalcularHuevos(10, 30);
    System.out.println(turuleca);

    // Imprimir nombre
    System.out.println("DAVID MOLINA MORALES");

    // Pedimos cuantas gallinas y zorros tenemos
    System.out.println("\n");
    System.out.println("Cuantos zorros tenemos? : ");
    zorros = Teclado.nextInt();

    System.out.println("Cuantas gallinas tenemos? :");
    gallinas = Teclado.nextInt();

    zorritoAdorable.NumeroZorros(zorros);
    System.out.println(zorritoAdorable);

    turuleca.NumeroGalinas(gallinas);
    System.out.println(turuleca);

    // Llamar a la función picos para saber cuantos hay
    System.out.println("Numero de picos de las gallinas que tenemos: ");
    System.out.println(turuleca.NumeroPicos());

    // Llamar a la función para saber cuantas patas hay
    System.out.println("Numero de patas de las gallinas que tenemos: ");
    System.out.println(turuleca.NumeroPatas());

    // Llamar a la función para saber cuantas patas y picos hay
    System.out.println("Numero de patas y picos de las gallinas que tenemos: ");
    System.out.println(turuleca.NumeroPatasYPicos());

    // Funcion zorro mata Gallinas
    // Gallinas que tenemos
    System.out.println("Gallinas que tenemos: ");
    System.out.println(turuleca.getNumeroAnimales());
    gallinas_disponibles = turuleca.getNumeroAnimales();

    System.out.println("Cuantas gallinas ha matado nuestro Silvestre? : ");
    decesos = Teclado.nextInt();
    mataGallinas.SilvestreMataGallinas(gallinas_disponibles, listaDecesos, Teclado);

    // Imprimir Lista
    System.out.println(listaDecesos);

  }
}
