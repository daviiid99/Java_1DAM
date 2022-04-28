class Gafas_Sol extends Gafas{

  public boolean sonChinas(){
    return false;
  }

  public String paisFabricacionGafas(){
    return "VIVA ESPAÑA";
  }

  public String accesorios(){
    return super.accesorios() + "\nCaja Azul";
  }

  public void setColor(String color){
    super.setColor(color);
  }

  public String toString(){
    return super.toString();
  }


}
