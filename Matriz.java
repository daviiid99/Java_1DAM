class Matriz {
  private int matriz[][];
  private int filas;
  private int columnas;

  public Matriz(){
    this.filas = 2;
    this.columnas = 2;
    this.matriz = new int[filas][columnas];
    rellenarMatriz(0);
  }

  public Matriz(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new int[filas][columnas];
  }

  public void rellenarMatriz(int numero){
    for (int i = 0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = numero;

      }
    }
  }

  public void imprimir(){
    for (int i = 0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        System.out.print(this.matriz[i][j]);
      }
      System.out.println("");
    }
  }



}
