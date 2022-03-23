class Matriz {
  private int matriz[][];
  private int filas;
  private int columnas;

  public Matriz(){
    this.filas = 8;
    this.columnas = 8;
    this.matriz = new int[filas][columnas];
    rellenarMatriz(0);
  }

  public Matriz(String funcion){
    this.filas = 8;
    this.columnas = 8;
    this.matriz = new int[filas][columnas];
    if ( funcion == "fila") rellenarMatrizFila(-1);
    if ( funcion == "columna") rellenarMatrizColumna(0);
    if ( funcion == "posicion") rellenarMatrizPosicion(0);
    if ( funcion == "sumar") rellenarMatrizFilaMasColumna(0);
    if ( funcion == "multiplicar") rellenarMatrizFilaPorColumna(0);

  }

  public Matriz(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new int[filas][columnas];
  }

public void rellenarMatrizFila (int numero){
  // Rellena cada fila con su numero de fila
  for (int i = 0; i < this.filas ; i++){
    for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = i;
}
}
}


public void rellenarMatrizColumna (int numero){
  // Rellena cada columna con su numero de columna
    for (int i = 0; i < this.columnas; i++){
    for (int j = 0; j < this.filas; j++){
      this.matriz[i][j] = j;

      }
}
}

public void rellenarMatrizPosicion (int numero){
  // Rellena cada posicion con su numero
  for (int i = 0; i < this.columnas ; i++){
  for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = numero;
        numero +=1;
}
}
}


public void rellenarMatrizFilaMasColumna(int numero){
  for (int i = 0; i < this.columnas ; i++){
  for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] =  i+j;
}
}
}

public void rellenarMatrizFilaPorColumna(int numero){
  for (int i = 0; i < this.columnas ; i++){
  for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = i*j;
}
}
}


  public void rellenarMatriz(int numero){
    for (int i = 0; i < this.filas ; i++){

      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = numero;

      }
    }
  }

  public void lineaHorizontal(){
for (int i = 0; i < this.columnas ; i++){
  System.out.print("==");
}
System.out.println("=");
  }

  public void imprimir(){
    lineaHorizontal();
    lineaHorizontal();
    for (int i = 0; i < this.filas ; i++){
      System.out.print("|");
      for (int j = 0; j < this.columnas; j++){
        System.out.print(this.matriz[i][j]);
        System.out.print("|");
      }
      System.out.println();
      lineaHorizontal();
      lineaHorizontal();
    }
  }
}
