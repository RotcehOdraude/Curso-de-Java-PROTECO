public class CuentaBanco{
  private int balance = 50;

  public CuentaBanco(){}

  //Consulta de saldo
  public int getBalance(){
    return balance;
  }
  //Retiro de dinero
  public void retiroBancario(int retiro){
    balance -= retiro;
  }
}
