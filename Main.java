import java.util.Scanner;


class Main{

  public static boolean pedir_password_numerica(Password_Number password){
    String ask;
    Scanner scan = new Scanner(System.in);

    System.out.println("Introduce una contraseña numerica :");
    ask = scan.nextLine();
    password = new Password_Number(ask);
    System.out.println(password);
    return password.isValid();

  }

  public static boolean pedir_password_letras(Password_Char password_2){
    String ask;
    Scanner scan = new Scanner(System.in);

    System.out.println("Introduce una contraseña con solo letras :");
    ask = scan.nextLine();
    password_2 = new Password_Char(ask);
    System.out.println(password_2);
    return password_2.isValid();

  }

  public static void main(String[] args) {
    Password_Number pass;
    Password_Number password = new Password_Number();
    Password_Char password_2 = new Password_Char();

    boolean isValid = false;


    // Probamos a obtener una contraseña numerica valida
    while (!isValid) {
      isValid = pedir_password_numerica(password);
      
    }

    isValid = false;


    // Probamos a obtener una contraseña con letras valida
    while (!isValid) {
      isValid = pedir_password_letras(password_2);
      
    }

    //Probamos una contraseña con longitud 3,4 y 5 digitos
    System.out.println("\nContraseña con longitud 3 cifras : ");
    pass = new Password_Number("123");
    System.out.println(pass);

    System.out.println("\nContraseña con longitud 4 cifras : ");
    pass = new Password_Number("1234");
    System.out.println(pass);

    System.out.println("\nContraseña con longitud 5 cifras : ");
    pass = new Password_Number("12345");
    System.out.println(pass);

    //Probamos una contraseña con 3 digitos repetidos al principio, medio y final
    System.out.println("\nContraseña con 3 digitos repetidos en el principio : ");
    pass = new Password_Number("000123");
    System.out.println(pass);

    System.out.println("\nContraseña con 3 digitos repetidos en el medio : ");
    pass = new Password_Number("122234");
    System.out.println(pass);

    System.out.println("\nContraseña con 3 digitos repetidos en el final : ");
    pass = new Password_Number("1234555");
    System.out.println(pass);






    System.out.println("DAVID MOLINA MORALES");
}
}
