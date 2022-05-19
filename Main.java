import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void solucionAlternativa(int numPersonas){
    Albergue arrAlbergue[] = Albergue.values();
    double descuento = 0.85; // Descuento del 15% es *0,85
    double habitacionesNec;
    double precio;

    for (Albergue h : arrAlbergue){
      habitacionesNec = Math.ceil((double)numPersonas/(double)h.getPersonas());
      if (habitacionesNec <= h.getHabitaciones()){
        precio = habitacionesNec*h.getPrecio()*descuento;
        System.out.println("Con habitaciones de tipo " + h + " vas a necesitar " +
        habitacionesNec + " habitaciones y el precio por dia con descuento " +
        precio + " euros.");
      }
    }
  }

  public static double recaudacionTotal(double dinero_reserva){
    return dinero_reserva;
  }

  public static float adelantarTiempo(float tiempo){
    return tiempo+=1;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    Albergue habitacion = Albergue.SIMPLE;
    String tipoHabit;
    int numPersonas = 0, numNoches;
    double precioTotal, precioNoche, precioPorPersona;
    double recaudacionTotal = 0;
    float tiempo = 0;
    
    // Inicializamos un array a 0
    ArrayList<Albergue> ocupadas = new ArrayList<>();

    //Mientras sea valida la habitacion y además queda alguna habitacion libre preguntamos

    try {

      while (ocupadas.size() < 4 && tiempo < 24){
        if (ocupadas.size() > 0) ocupadas.clear();

        // Creamos un array con todas las habitaciones que haY
        Albergue arrAlbergue[] = Albergue.values();

        System.out.println("-- Solicitar tipo de habitacion, numero de personas y numero de noches --");
        System.out.print("Indica el tipo de habitacion que desea: ");
        tipoHabit = sc.nextLine();
        habitacion = Albergue.valueOf(tipoHabit);

        // Vamos a reducir las habitaciones disponibles del tipo seleccionado
        habitacion.setHabitaciones();

         // Cada vez que un tipo de habitacion tenga 0 plazas, se añade a la lista
        for (Albergue h : arrAlbergue){
          if (h.getHabitaciones() == 0){
            ocupadas.add(h);
            System.out.println("Tipo Habitaciones Ocupadas: \n" + ocupadas);
          }
        }
        

        System.out.print("Indica el numero de personas que sois: ");
        numPersonas = Integer.parseInt(sc.nextLine());
        while (habitacion.getPersonas() < numPersonas) {
          System.out.println("\nError : Introduce un numero valido de personas\nPara la habitacion seleccionada " + habitacion + " el limite es " + habitacion.getPersonas());
          numPersonas = Integer.parseInt(sc.nextLine());
        }
        

        System.out.print("Indica el numero de noches que os vais a quedar: ");
        //numNoches = sc.nextInt(); sc.nextLine();
        numNoches = Integer.parseInt(sc.nextLine());
        System.out.println("-- Calcular precio total -- ");
        precioTotal = habitacion.precioTotal(numNoches);
        System.out.println("El precio total es de: " + precioTotal);
        System.out.println("-- Calcular precio por persona -- ");
        precioPorPersona = habitacion.precioPorPersona(precioTotal,numPersonas);
        System.out.println("El precio por persona es de: " + precioPorPersona);
        System.out.println("-- Proponer habitacion alternativa con descuento --");

        // Vamos a generar un registro de la recaudacion por habitacion hasta ocuparlas todas
        recaudacionTotal += recaudacionTotal(precioTotal);
        System.out.println("\nRecaudacion del Albergue : \n" + recaudacionTotal);

        // Vamos a aumentar 1h por cada reserva hasta alcanzar las 24h
        tiempo = adelantarTiempo(tiempo);
        System.out.println("Hora: \n Son las " + tiempo + "h");

        // Imprimir en caso de quedarse sin habitaciones
        if (ocupadas.size() == 4){
          System.out.println("\nLo sentimos, nos hemos quedado sin habitaciones!\nQue tenga un buen día!");
        }

        // Imprimir en caso de ser la hora de cerrar
        if ( tiempo == 24.0){
          System.out.println("\nLo sentimos, es la hora de cerrar!");
        }


      }

    } catch (Exception e){
        System.out.println("\nAlgo ha salido mal...\n");
    } finally {
        System.out.println("Estoy en el finally");
      }
  
    //if (habitacion.getHabitaciones() == 0){
      //System.out.println("Hemos cometido un error y no quedan libres habitaciones como las reservada, tenemos estas opciones con descuento: ");
      //solucionAlternativa(numPersonas);
    }
}
