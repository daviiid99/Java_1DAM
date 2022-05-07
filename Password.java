public abstract class Password{
  protected String password;
  protected boolean esvalida;


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
    int contador = 1;
    esvalida = true;
    for ( int i = 1; i < this.password.length() ; i++){
      if (this.password.charAt(i) == this.password.charAt(i-1) ){
        contador +=1;
      }
    }
    if (contador >= 3) esvalida = false;

    return esvalida;
  }

  public abstract boolean validSize();
  public abstract boolean validChar();

  public String toString(){
    return "\nPassword : " + this.password + "\nNo Same Value X3 ? :" + noRepetidosX3()  ;
  }

}
