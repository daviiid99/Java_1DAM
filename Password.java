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
    esvalida = true;
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
    return this.noRepetidosX3() && validChar() && validSize();
  }

  public String toString(){
    return "\nPassword : " + this.password + "\nNo Same Value X3 ? :" + noRepetidosX3()  ;
  }

}
