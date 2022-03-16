class Main{
  public static void main(String[] args){
    Persona miPersona = new Persona();
    Alumno miAlumno = new Alumno("Marivi", "987654321A", "ASD");
    Alumno alumnoDefecto = new Alumno();
    Profesor Celia = new Profesor("Celia", "1234567A", 2500, 123456789);


    miPersona.setNombre("DVD");
    miPersona.setDni("77556752Q");

    System.out.println(miPersona.getDni());
    System.out.println(miPersona.getNombre());
    System.out.println(alumnoDefecto);
    System.out.println(miAlumno);
    System.out.println(Celia);
  }
}
