// DAVID MOLINA MORALES
import java.util.ArrayList;

class Cable{
  private float longitud;
  private String entrada;
  private String salida;
  private boolean USB_data;

  public Cable(){
    this.longitud = 2;
    this.entrada = "USB_A";
    this.salida = "USB-C";
    this.USB_data = true;
  }

  public Cable (float longitud, String entrada, String salida, boolean USB){
    this.longitud = longitud;
    this.entrada = entrada;
    this.salida = salida;
    this.USB_data = USB;
  }

  public void setLongitud (float longitud){
    this.longitud = longitud;
  }

  public void setEntrada(String entrada){
    this.entrada = entrada;
  }

  public void setSalida(String salida){
    this.salida = salida;
  }

  public void setDatos(boolean USB){
    this.USB_data = USB;
  }

  public float getLongitud(){
    return this.longitud;
  }

  public String getEntrada(){
    return this.entrada;
  }

  public String getSalida(){
    return this.salida;
  }

  public boolean getUSBDATA(){
    return this.USB_data;
  }

  public void utilidadCables(ArrayList<String> listaCables, ArrayList<Boolean> listaCablesUSBData){
    for ( int i = 0; i < listaCables.size(); i++){
      if (listaCables.get(i).contains("microUSB") && listaCablesUSBData.get(i) == true){
        System.out.println("Se ha detectado que uno de los cables conectados transfiere datos USB");
      }
        }

  }

  public String toString(){
    return "\n\n-------Caracteristicas cable-------\n" + "Longitud: " + this.longitud + "\nTipo Entrada: " + this.entrada + "\nTipo Salida: " + this.salida + "\nTransferencia de Datos USB? " + this.USB_data;
  }


}
