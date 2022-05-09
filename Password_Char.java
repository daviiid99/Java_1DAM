public class Password_Char extends Password{
  private boolean esvalida;
  private final static int VALID_SIZE = 8;


  public Password_Char(){
    super();
  }

  public Password_Char(String password){
    super(password);
  }

  public boolean validSize(){
    return (this.password.length() >= VALID_SIZE);
  }

  public boolean validChar(){
    boolean isChar = this.password.chars().allMatch( Character::isLetter );
     
      return isChar;
        }

  public String toString(){
    return super.toString() + "\nValid Size ? : " + validSize() + "\nValid Chars ? " + validChar();
  }

}
