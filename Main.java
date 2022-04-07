import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    Tablero tresEnRaya = new Tablero();
    Tablero posiciones = new Tablero();


    // Pruebas con constructores por defecto y valores
  //tresEnRaya.rellenarMatrizEntera(fichaO);
  //tresEnRaya.imprimir();

    // Recogemos la posicion
    tresEnRaya.rellenarMatrizUsuario();



  }
}
