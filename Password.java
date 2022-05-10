import java.util.Arrays;
import java.util.ArrayList;

public abstract class Password{
  protected String password;

  protected final static String PASSWORD = "123";

  public Password(){
    this(PASSWORD);
  }
  public Password(String password){
    setPassword(password);
  }

  public void setPassword(String password){
    this.password = password;
  }

  public boolean noRepetidosX3(){
    boolean esvalida = true;
    int contador = 1;
    char anterior;
    char actual;
    for (int i = 1; i < this.password.length() & esvalida; i++){
        actual = this.password.charAt(i);
        anterior = this.password.charAt(i-1);

        if (actual == anterior){
            contador +=1;
        }
         else {
            contador = 1;
         }

        if (contador >=3) esvalida= false;

    } 

    return esvalida;   
        
}   

  public abstract boolean validSize();
  public abstract boolean validChar();

  public boolean isValid(){
    return noRepetidosX3() && validChar() && validSize();
  }

  public boolean neverUsedThreefold(){
    char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    char[] letras =  {
    'a','b','c','d','e','f','g','h','i','j',
    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
    't', 'u', 'v', 'w', 'x', 'y', 'z',
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
    'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    ArrayList<Integer> posiciones_int = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
    ArrayList<Integer> posiciones_char = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
    boolean esvalida = true;

    for (int i = 0; i < this.password.length() && esvalida; i++){
      for (int j = 0; j < numeros.length && j < letras.length; j++){
        if (this.password.charAt(i) == numeros[j]){
          posiciones_int.add(j, posiciones_int.get(j)+1);
          if (posiciones_int.get(j) >= 3) esvalida = false;
        }

        if (this.password.charAt(i) == letras[j]) {
          posiciones_char.add(j, posiciones_char.get(j)+1);
          if (posiciones_char.get(j) >= 3) esvalida = false;
        }


      }
    }

    return esvalida;
  }

  public String toString(){
    return "\nPassword : " + this.password + "\nNo Same Value X3 ? :" + noRepetidosX3() + "\nNo Values Used Threefold : " + neverUsedThreefold();
  }

}
