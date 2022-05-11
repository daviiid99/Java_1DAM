class Main{
  public static void main(String[] args){
    Persona miPersona = new Persona();
    Alumno miAlumno = new Alumno("Marivi", "987654321A", "ASD");
    Alumno alumnoDefecto = new Alumno();
    Profesor Celia = new Profesor("Celia", "1234567A", 2500, 123456789);

    /*
    miPersona.setNombre("DVD");
    miPersona.setDni("77556752Q");

    System.out.println(miPersona.getDni());
    System.out.println(miPersona.getNombre());
    System.out.println(alumnoDefecto);
    System.out.println(Celia);
    **/

     System.out.println(miAlumno);


     Color miColor, miSegundoColor;
     Color arrayColores[] = Color.values();

     for (Color c : arrayColores){
      System.out.println(c);

    }

      System.out.println("Asignando Color con Color.COLOR :");
      miColor = Color.ROJO;
      System.out.println(miColor);
      System.out.println("Asignando Color con Color.valueOf :");
      miColor = Color.valueOf("VERDE");
      System.out.println(miColor);
      System.out.println(miColor.getNumLapices());
      System.out.println(Color.VERDE.getNumLapices());

      // AHORA CON ERROR
      // System.out.println("Asignando Color QUE NO EXISTE Color.COLOR : \n");
      //miColor = Color.NEGRO;
      //System.out.println(miColor);
      System.out.println("Asignando Color con Color.valueOf :");
      
      try {
        miColor = Color.valueOf("NEGRO");
        System.out.println(miColor);
      }
      catch (Exception e){
        System.out.println("Ese color no existe");
      }


      System.out.println("¿Cuantos lapices azules tengo si -2?\n");
      miSegundoColor = Color.valueOf("AZUL");
      miSegundoColor.setNumLapices(-2);
      System.out.println("LAPICES AZULES para mi segundo color");
      System.out.println(miSegundoColor.getNumLapices());
      System.out.println("LAPICES AZULES para mi segundo color");
      miColor = Color.valueOf("AZUL");
      System.out.println(miColor.getNumLapices());
      System.out.println("EL ordinal de mi segundo color verde : \n");
      System.out.println(miColor.ordinal());

      System.out.println("¿Cuantos lapices azules tengo si -2?\n");
      miSegundoColor = Color.valueOf("AZUL");
      miSegundoColor.setNumLapices(2);
      System.out.println("LAPICES AZULES para mi segundo color");
      System.out.println(miSegundoColor.getNumLapices());
      System.out.println("LAPICES AZULES para mi segundo color");
      miColor = Color.valueOf("AZUL");

      System.out.println(miColor.AZUL.getNumLapices());

      System.out.println(miColor.AMARILLO.getNumLapices());

      DaysOfWeek semana;

      DaysOfWeek dias[] = DaysOfWeek.values();

      for ( DaysOfWeek days : dias)
        if (days.getFeeling().equals("HAPPY")) System.out.println(days);

      
      semana = DaysOfWeek.valueOf("MONDAY");
      semana.setFeeling("SO SAD");
      semana.setSleepTime(12);
      System.out.println(semana);
    
  }
}
