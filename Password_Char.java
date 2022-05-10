public class Password_Char extends Password{

  public Password_Char(){
    super();
  }

  public Password_Char(String password){
    super(password);
  }

  public boolean validSize(){
    return (this.password.length() >= 8);
  }

  public boolean validChar(){
    boolean valido = true;
    for (int i = 0; i < (this.password).length() & valido ; i++){
      valido = Character.isLetter(this.password.charAt(i));
    }
    return valido;

    /*
    boolean isChar = this.password.chars().allMatch( Character::isLetter );
    return isChar; **/
  }

  public String toString(){
    return super.toString() + "\nValid Size ? : " + validSize() + "\nValid Chars ? " + validChar();
  }

}
