class Main{

  public static void main(String[] args){
    Matriz matriz = new Matriz();
    System.out.println("\nMatriz por defecto: \n");
    matriz.imprimir();

    Matriz matrizfila = new Matriz("fila");
    System.out.println("\nMatriz filas con numeros: \n");
    matrizfila.imprimir();

    Matriz matrizposicion = new Matriz("posicion");
    System.out.println("\nMatriz posicion con numeros: \n");
    matrizposicion.imprimir();

    Matriz matrizcolumna = new Matriz("columna");
    System.out.println("\nMatriz columna con numeros: \n");
    matrizcolumna.imprimir();

    Matriz matrizsuma = new Matriz("sumar");
    System.out.println("\nMatriz suma con numeros: \n");
    matrizsuma.imprimir();

    Matriz matrizmulti = new Matriz("multiplicar");
    System.out.println("\nMatriz multiplica con numeros: \n");
    matrizmulti.imprimir();
}
}
