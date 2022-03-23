import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner Teclado = new Scanner(System.in);
    Tablero tresEnRaya = new Tablero();
    String ficha;

  System.out.println("Introduce el tipo de ficha para jugar: X|O \n");
  ficha = Teclado.nextLine();
  tresEnRaya = new Tablero(ficha);
  tresEnRaya.imprimir();
  tresEnRaya.posicionTablero();

  }
}
