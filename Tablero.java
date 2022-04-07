import java.util.ArrayList;
import java.util.Scanner;

class Tablero{
  private Ficha tablero[][];
  private int posiciones[][];
  private int filas;
  private int columnas;
  private Scanner teclado = new Scanner(System.in);
  private int posicion;

  public Tablero(){
      this.filas = 3;
      this.columnas = 3;
      this.tablero = new Ficha[filas][columnas];
      this.posiciones = new int[filas][columnas];
      this.posicion = 0;

    }

  public void rellenarMatrizPosicion (){
    int numero = 0;
    // Rellena cada posicion con su numero
    for (int i = 0; i < this.columnas ; i++){
    for (int j = 0; j < this.filas; j++){
          this.posiciones[i][j] = numero;
          numero +=1;
  }
  }
  }


  public void rellenarTableroFicha (Ficha ficha){
    int numero = 0;
    // Rellena cada posicion con su numero
    for (int i = 0; i < this.columnas ; i++){
    for (int j = 0; j < this.filas; j++){
          this.tablero[i][j] = ficha;
  }
  }
  }



    public void preguntarPosicion(){
      //Preguntamos donde poner la ficha
      System.out.println("\nEn que posicion del tablero quieres poner la ficha: \n(Escribe '-1' para dejar de jugar)\n(Escribe 99 para limpiar el tablero)\n");
      this.posicion = teclado.nextInt();
      devolverPosicion();
    }

    public int devolverPosicion(){
      return this.posicion;
    }

    public void rellenarMatrizUsuario (){
      // Declaro las variables de tipo ficha
      int posicion = 0;
      int columna = 0;
      int fila = 0;
      Ficha fichaO = new Ficha("O");
      Ficha fichaX = new Ficha();
      Ficha fichadefecto = new Ficha(" ");

      rellenarTableroFicha(fichadefecto);

      for (int i = 0; posicion > -1 ; i++){
        // Metodo para limpiar el tablero una vez relleno
        if (posicion == 99){
           i = 0;
          rellenarTableroFicha(fichadefecto);
        }
        // Metodo para dejar el tableo limpio al inicio
       else if ( i == 0){
          fila = posicion/3;
          columna = posicion % 3;
          this.tablero[fila][columna] = fichadefecto;
        }

          // Posicion 0 a 2
          else if ( (i % 2 == 0) && (posicion >=0 && posicion <=2) ){
            fila = posicion/3;
            columna = posicion % 3;
            this.tablero[fila][columna] = fichaX;
          }
         else if ((i % 2 == 1) && (posicion >=0 && posicion <=2) ){
           fila = posicion/3;
           columna = posicion % 3;
           this.tablero[fila][columna] = fichaO;
          }
          // Posicion 3 a 5
          else if ((i % 2 == 0) &&(posicion >=3 && posicion <=5) ) {
           fila = posicion/3;
           columna = posicion % 3;
            this.tablero[fila][columna] = fichaX;
            }
          else if ((i % 2 == 1) && (posicion >=3 && posicion <=5) ) {
            fila = posicion/3;
            columna = posicion % 3;
            this.tablero[fila][columna] = fichaO;
              }
            // Posicion 6 a 8
          else if ((i % 2 == 0) && (posicion >=6 && posicion <=8) ) {
            fila = posicion/3;
            columna = posicion % 3;
            this.tablero[fila][columna] = fichaX;
            }

            else if (posicion > 8){
              System.out.println("\nIntroduciste una posicion que no existe\nPierdes tu turno!");
            }

          else {
            fila = posicion/3;
            columna = posicion % 3;
            this.tablero[fila][columna] = fichaO;
          }

          // Posiciones para que el usuario elija
          rellenarMatrizPosicion();
          imprimir_ejemplo();

         // Imprimir el tablero rellenado en su estado actual
          imprimir();

          // Preguntar de nuevo una posicion del tablero
          if ( i % 2 == 1 ) System.out.println("----Turno jugador 2----");
          if ( i % 2 == 0 ) System.out.println("----Turno jugador 1----");
          System.out.println("-------Ronda" + i + "-------");
          preguntarPosicion();
          posicion = devolverPosicion();
      }
    }

  public void lineaHorizontal(){
for (int i = 0; i < this.columnas ; i++){
  System.out.print("--");
}
System.out.println("-");
  }

public void imprimir(){
  System.out.println("-------- Tablero --------");
  lineaHorizontal();
  for (int i = 0; i < this.filas ; i++){
    System.out.print("|");
    for (int j = 0; j < this.columnas; j++){
      System.out.print(this.tablero[i][j].getForma());
      System.out.print("|");
    }
    System.out.println();
    lineaHorizontal();
  }
}


public void imprimir_ejemplo(){
  System.out.println("-------- Posiciones --------");
  lineaHorizontal();
  for (int i = 0; i < this.filas ; i++){
    System.out.print("|");
    for (int j = 0; j < this.columnas; j++){
      System.out.print(this.posiciones[i][j]);
      System.out.print("|");
    }
    System.out.println();
    lineaHorizontal();
  }
}

}
