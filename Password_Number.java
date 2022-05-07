import java.util.Arrays;
import java.util.ArrayList;


public class Password_Number extends Password{
  private String[] lista =  null;
  private final static int VALID_SIZE = 4;
  private final static char[] NUMEROS = {'0','1','2','3','4','5','6','7','8','9'};

  public Password_Number(){
    super();
  }

  public Password_Number(String password){
    super(password);
  }

  public boolean validSize(){
    esvalida = false;
    if (password.length() >= VALID_SIZE){
      esvalida = true;
    }
    return esvalida;
  }

  public boolean validChar(){
    int contador = 0;
    esvalida = false;
    for (int i = 0; i < this.password.length(); i++){
      for (int j = 0; j < NUMEROS.length; j++){
        if (NUMEROS[j] == this.password.charAt(i)) {
          contador +=1;
        } else {
          contador = contador;
        } ;
      }
       if (contador == this.password.length()) this.esvalida = true;
      }
      System.out.println("\nTu contrasenia " + password + " tiene " + this.password.length() + " caracteres " + "de los cuales " + contador + " son validos");
    return esvalida;
  }

  public String toString(){
    return super.toString() + "\nValid Size ? : " + validSize() + "\nValid Chars ? " + validChar();
  }


}
