import java.util.Scanner;

class Main{

  public static void jugarConMascota(String preguntar, String pet, Scanner teclado, Gato miGato, Pato miPato, int deposito_caca){
    System.out.println("\n-------Menu Seleccion Mascota------\n1: Seleccionar Mascota Existente");
    preguntar = teclado.nextLine();
    System.out.println("\nEspecifica el tipo de Animal:\n1: Gato\n2: Pato");
    preguntar = teclado.nextLine();

    if (Integer.valueOf(preguntar) == 1) jugarConGato(preguntar, pet, teclado, deposito_caca, miGato);
    if (Integer.valueOf(preguntar) == 2) jugarConPato(preguntar, pet, teclado, deposito_caca, miPato);

  }

  public static void jugarConGato(String preguntar, String pet, Scanner teclado, int deposito_caca, Gato miGato){
    System.out.println("\nComo se llama tu mascota?");
    pet = teclado.nextLine();
    miGato = new Gato(pet);
    while (Integer.valueOf(preguntar) != 10){
      System.out.println("\n---------- Elige que hacer con " + miGato.getNombreMascota() + "--------\n1: Ir al Toilet\n2: Ver Retrete\n3: Hora de Cantar!\n4: Ir a Dormir\n5: Dar de comer\n6: Aparearse con otro animal\n7: Acariciar\n8: Limpiar Retrete\n9: Ver nivel amistad\n10: Dejar de jugar");
        preguntar = teclado.nextLine();
        if (Integer.valueOf(preguntar) == 1){
          System.out.println("\nTu " + miGato.getNombreMascota() + " ha hecho " + miGato.excretando(deposito_caca) + "\n");
        }
        else if (Integer.valueOf(preguntar) == 2){
          System.out.println("\nTu " + miGato.getNombreMascota() +  " hizo caca " + miGato.getDepositoCaca() + " veces\n");
        }
        else if (Integer.valueOf(preguntar) == 3){
          System.out.println("\n" + miGato.getNombreMascota() + " ha dicho " + miGato.onomatopeya() + "\n");
        }
        else if (Integer.valueOf(preguntar) == 4){
          System.out.println("\n" + miGato.durmiendo() + "... Parece que " + miGato.getNombreMascota() + " se ha dormido\n");
        }
        else if (Integer.valueOf(preguntar) == 5){
          System.out.println("\nQue quieres dar de comer a  " + miGato.getNombreMascota() + ": \n1: Sardinas Premium\n2: Pate XXL\n3: Pienso Barato");
          preguntar = teclado.nextLine();
          String comida = "";
          if (Integer.valueOf(preguntar) == 1){
            miGato.setNivelAmistad();
            System.out.println("\n^.^ Parece que le ha gustado\nTu amistad con " + miGato.getNombre() + " ha subido 1 punto");
            comida = "Sardinas Premium";
          }
          if (Integer.valueOf(preguntar) == 2) comida = "Pate XXL";
          if (Integer.valueOf(preguntar) == 3) comida = "Pienso Barato";
          System.out.println("\n" + miGato.comiendo(comida) + " a " + miGato.getNombreMascota() + "\n");
        }
        else if (Integer.valueOf(preguntar) == 6){
          if (miGato.follando()  == true){
            System.out.println("Tu " + miGato.getNombre() + " ha tenido " + miGato.getNumeroCrias() + " gatitos");
          } else {
            System.out.println("Tu " + miGato.getNombre() + " no ha tenido gatitos :(");
          }
        }
        else if (Integer.valueOf(preguntar) == 7){
          miGato.setAcariciarGato();
          System.out.println("Has acariciado a " + miGato.getNombreMascota() + "... Parece que le ha gustado\n^-^\n" );
        }
        else if (Integer.valueOf(preguntar) == 8){
          if (miGato.getDepositoCaca() < 3){
            System.out.println("\nNo pasó nada ...");
          } else {
            miGato.vaciarDeposito(miGato.getDepositoCaca());
            System.out.println("\nHas tirado de la cadena\n" );
          }

        }
        else if (Integer.valueOf(preguntar) == 9){
          System.out.println("Tu nivel de amistad con " + miGato.getNombre() + " es " + miGato.getNivelAmistad()+"/10");
        }
        else {
          System.out.println("Hasta luego, " + miGato.getNombreMascota() + "!");
        }
    }
  }


  public static void jugarConPato(String preguntar, String pet, Scanner teclado, int deposito_caca, Pato miPato){
    System.out.println("\nComo se llama tu mascota?");
    pet = teclado.nextLine();
    miPato = new Pato(pet);
    while (Integer.valueOf(preguntar) != 10){
      System.out.println("\n---------- Elige que hacer con " + miPato.getNombreMascota() + "--------\n1: Ir al Toilet\n2: Ver Retrete\n3: Hora de Cantar!\n4: Ir a Dormir\n5: Dar de comer\n6: Aparearse con otro animal\n7: Acariciar\n8: Limpiar Retrete\n9: Ver nivel amistad\n10: Dejar de jugar");
          preguntar = teclado.nextLine();
          if (Integer.valueOf(preguntar) == 1){
            System.out.println("\nTu " + miPato.getNombreMascota() + " ha hecho " + miPato.excretando(deposito_caca) + "\n");
          }
          else if (Integer.valueOf(preguntar) == 2){
            System.out.println("\nTu " + miPato.getNombreMascota() +  " hizo caca " + miPato.getDepositoCaca() + " veces\n");
          }
          else if (Integer.valueOf(preguntar) == 3){
            System.out.println("\n" + miPato.getNombreMascota() + " ha dicho " + miPato.onomatopeya() + "\n");
          }
          else if (Integer.valueOf(preguntar) == 4){
            System.out.println("\n" + miPato.durmiendo() + "... Parece que " + miPato.getNombreMascota() + " se ha dormido\n");
          }
          else if (Integer.valueOf(preguntar) == 5){
            System.out.println("\nQue quieres dar de comer a  " + miPato.getNombreMascota() + ": \n1: Pan\n2: Palomitas\n3: Bebida con superpoderes");
            preguntar = teclado.nextLine();
            String comida = "";
            if (Integer.valueOf(preguntar) == 1) comida = "Pan";
            if (Integer.valueOf(preguntar) == 2) comida = "Palomitas";
            if (Integer.valueOf(preguntar) == 3){
              miPato.setNivelAmistad();
              System.out.println("\n^.^ Parece que le ha gustado\nTu amistad con " + miPato.getNombre() + " ha subido 1 punto");
              comida = "Bebida con superpoderes";
            }
            System.out.println("\n" + miPato.comiendo(comida) + " a " + miPato.getNombreMascota() + "\n");
          }
          else if (Integer.valueOf(preguntar) == 6){
            if (miPato.follando() == true){
              System.out.println("Tu " + miPato.getNombre() + " ha tenido " + miPato.getNumeroCrias() + " patitos");
            } else {
              System.out.println("Tu " + miPato.getNombre() + " no ha tenido patitos :(");
            }
          }
          else if (Integer.valueOf(preguntar) == 7){
            miPato.setAcariciarPato();
            System.out.println("Has acariciado a " + miPato.getNombreMascota() + "... Parece que le ha gustado\n^-^\n" );
          }
          else if (Integer.valueOf(preguntar) == 8){
            if (miPato.getDepositoCaca() < 3){
              System.out.println("\nNo pasó nada ...");
            } else {
              miPato.vaciarDeposito(miPato.getDepositoCaca());
              System.out.println("\nHas tirado de la cadena\n" );
            }

          }
          else if (Integer.valueOf(preguntar) == 9){
            System.out.println("Tu nivel de amistad con " + miPato.getNombre() + " es " + miPato.getNivelAmistad()+"/10");
          }
          else {
            System.out.println("Hasta luego, " + miPato.getNombreMascota() + "!");
          }
    }
  }


  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String preguntar = "0";
    int contador = 0;
    int deposito_caca = 0;
    String opcion;
    String clase;
    String pet = "";
    Gato miGato = new Gato();
    Pato miPato = new Pato();
    //System.out.println(miGato.onomatopeya());
    //System.out.println(miGato.durmiendo());

    // Jugamos con nuestro animal
    jugarConMascota(preguntar, pet, teclado,  miGato, miPato, deposito_caca);


  }
}
