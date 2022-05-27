import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


class Tablero{
  private String tablero[][];
  private int posiciones[][];
  private int filas;
  private int columnas;
  private Scanner teclado = new Scanner(System.in);
  private int posicion;
  protected String forma;

  public Tablero(){
      this.filas = 5;
      this.columnas = 5;
      this.tablero = new String[filas][columnas];
      this.posiciones = new int[filas][columnas];
      this.posicion = 0;
      this.forma = "ORO";

    }

  public void setForma(String forma){
    this.forma = forma;
  }

  public String getForma(){
    return this.forma;
  }

  public void rellenarMatrizPosicion(){
    Random random = new Random();
    String[] casillas = {"DIAMANTE", "ORO", "PLATA", "NADA", "CACA"};
    // Rellena cada posicion con su numero
    for (int i = 0; i < this.columnas ; i++){
    for (int j = 0; j < this.filas; j++){
      int index = random.nextInt(casillas.length);
      this.tablero[i][j] = casillas[index];
          
  }
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
      System.out.print(this.tablero[i][j]);
      System.out.print("|");
    }
    System.out.println();
    lineaHorizontal();
  }
}

public void posicion(int pos1, int pos2){
 System.out.println(this.tablero[pos1][pos2]);
}

public void rellenar(int fila, int columna, String ficha){

  this.tablero[fila][columna] = ficha;
}

public String queHay(int posicion){
  int fila = 0;
  int columna = 0;
  if ((posicion %2 == 0)  && (posicion >=0 && posicion <=4)){
    fila = posicion/5;
    columna = posicion%5;
  }

  else if ((posicion % 2 == 0) &&(posicion >=5 && posicion <=9) ) {
    fila = posicion/5;
    columna = posicion % 5;
    }

  else if ((posicion % 2 == 0) &&(posicion >=10 && posicion <=14) ) {
    fila = posicion/5;
    columna = posicion % 5;
    }

  else if ((posicion % 2 == 0) &&(posicion >=15 && posicion <=19) ) {
    fila = posicion/5;
    columna = posicion % 5;
    }

  else if ((posicion % 2 == 0) &&(posicion >=20 && posicion <=24) ) {
    fila = posicion/5;
    columna = posicion % 5;
    }

  System.out.println(this.tablero[fila][columna]);
  return this.tablero[fila][columna];
}

public int[] donde(int posicion){
  int[] pos = new int[2];
  int fila = 0;
  int columna = 0;
  if ((posicion %2 == 0)  && (posicion >=0 && posicion <=4)){
    fila = posicion/5;
    columna = posicion%5;
  }

  else if ((posicion % 2 == 0) &&(posicion >=5 && posicion <=9) ) {
    fila = posicion/5;
    columna = posicion % 5;
    }

  else if ((posicion % 2 == 0) &&(posicion >=10 && posicion <=14) ) {
    fila = posicion/5;
    columna = posicion % 5;
    }

  else if ((posicion % 2 == 0) &&(posicion >=15 && posicion <=19) ) {
    fila = posicion/5;
    columna = posicion % 5;
    }

  else if ((posicion % 2 == 0) &&(posicion >=20 && posicion <=24) ) {
    fila = posicion/5;
    columna = posicion % 5;
    }

    pos[0] = fila;
    pos[1] = columna;

  System.out.println(this.tablero[fila][columna]);
  return pos;
}

public void rellenarMatrizNumeros (){
  int numero = 1;
  // Rellena cada posicion con su numero
  for (int i = 0; i < this.columnas ; i++){
    for (int j = 0; j < this.filas; j++){
      this.posiciones[i][j] = numero;
      numero +=1;
  }
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