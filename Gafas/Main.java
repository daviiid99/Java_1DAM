class Main{
  public static void main(String[] args) {
    Gafas_Sol gafasNuevas = new Gafas_Sol();
    System.out.println(gafasNuevas.sonChinas());
    System.out.println(gafasNuevas.paisFabricacionGafas());
    System.out.println(gafasNuevas.accesorios());
    gafasNuevas.setColor("AZUL");
    System.out.println(gafasNuevas);
  }
}
