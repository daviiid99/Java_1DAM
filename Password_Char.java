public class Password_Char extends Password{
  private boolean esvalida;
  private final static char[] LETRAS = {
    'a','b','c','d','e','f','g','h','i','j',
    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
    't', 'u', 'v', 'w', 'x', 'y', 'z',
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
    'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  private final static int VALID_SIZE = 8;


  public Password_Char(){
    super();
  }

  public Password_Char(String password){
    super(password);
  }

  public boolean validSize(){
    esvalida = false;
    if (this.password.length() >= VALID_SIZE){
      esvalida = true;
    }
    return esvalida;
  }

  public boolean validChar(){
    int contador = 0;
    esvalida = false;
    for (int i = 0; i < this.password.length(); i++){
      for (int j = 0; j < LETRAS.length; j++){
        if (LETRAS[j] == this.password.charAt(i)){
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
