// DAVID MOLNA MORALES
import java.util.Scanner;
import java.util.ArrayList;

class Adaptador{
  private int entrada;
  private int salida;
  private int puerto;
  private int puertos_disponibles;
  private Scanner Teclado = new Scanner(System.in);
  private int preguntar;

  public Adaptador(){
    this.entrada = 45;
    this.salida = 18;
    this.puerto = 2;
    this.puertos_disponibles = puerto;
  }

  public Adaptador(int entrada, int salida, int puerto){
    this.entrada = entrada;
    this.salida = salida;
    this.puerto = puerto;
    this.puertos_disponibles = puerto;
    if (puerto > 2) checkeoPuertos(puerto);
  }

  public void checkeoPuertos(int puerto){
    while (this.puerto > 2){
      System.out.println("Por favor, tu numero de puertos: " + this.puerto +"\nEs superior al maximo: 2\nIntroduce otro numero: ");
      preguntar = Teclado.nextInt();
      this.puerto = preguntar;
      this.puertos_disponibles = preguntar;
    }

    }

    public void setPuertosDisponibles(ArrayList<String>listaCables){
      for (int i = 0; i < listaCables.size(); i++){
        this.puertos_disponibles-=1;
      }
    }

    public int getPuertosDisponibles(){
      return this.puertos_disponibles;
    }

  public void setEntrada(int entrada){
    this.entrada = entrada;
  }

  public void setSalida(int salida){
    this.salida = salida;
  }

  public void setPuerto(int puerto){
    this.puerto = puerto;
  }

  public int getEntrada(){
    return this.entrada;
  }

  public int getSalida(){
    return this.salida;
  }

  public int getPuerto(){
    return this.puerto;
  }

  public String toString(){
    return "------Caracteristicas del Adaptador-------\nPotencia Entrada: " + this.entrada + "\nPotencia Salida: " + this.salida + "\nNumero Puertos: " + this.puerto;
  }

}
