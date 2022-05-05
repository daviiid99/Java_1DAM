class Main{
  public static void main(String[] args) {
    Jugador_Pro pepe2 = new Jugador_Pro("Soy un Pro");
    Jugador_Noob pepe = new Jugador_Noob("Estoy aprendiendo");
    Jugador_Pro pepe_Coche = new Jugador_Pro("Soy un pro con coche", 70);
    Jugador_Pro pepedoble = new Jugador_Pro();

    pepe2.miVehiculo().conducir();
    System.out.println(pepe2);
    pepe2.miVehiculo().acelerar(50);
    System.out.println(pepe2);

    pepe.caminar(40,30);
    pepe2.caminar(20,50);
    pepe_Coche.caminar(20,50);

    System.out.println(pepe);
    System.out.println(pepe2 + pepe2.miVehiculo().toString());
    System.out.println(pepe_Coche + pepe_Coche.miCoche().toString());
    System.out.println(pepedoble + pepedoble.miMonopatin().toString());
  }
}
