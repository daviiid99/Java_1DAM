import java.util.Arrays;
import java.util.ArrayList;


public class Password_Number extends Password{
  private String[] lista =  null;
  private final static int VALID_SIZE = 4;

  public Password_Number(){
    super();
  }

  public Password_Number(String password){
    super(password);
  }

  public boolean validSize(){
    return (password.length() >= VALID_SIZE);
  }

  public boolean validChar(){
      boolean isNumeric = this.password.chars().allMatch( Character::isDigit );
      return isNumeric;

}

  public String toString(){
    return super.toString() + "\nValid Size ? : " + validSize() + "\nValid Chars ? " + validChar();
  }


}
