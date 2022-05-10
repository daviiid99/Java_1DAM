public class Password_Number extends Password{

  public Password_Number(){
    super();
  }

  public Password_Number(String password){
    super(password);
  }

  public boolean validSize(){
    return (password.length() >= 4);
  }

  public boolean validChar(){
    boolean valido = true;
    for (int i = 0; i <(this.password).length() & valido ; i++){
      valido = Character.isDigit(this.password.charAt(i));
    }

    return valido;
    /*
    boolean isNumeric = this.password.chars().allMatch( Character::isDigit );
    return isNumeric;
    **/

  }

  public String toString(){
    return super.toString() + "\nValid Size ? : " + validSize() + "\nValid Chars ? " + validChar();
  }


}
