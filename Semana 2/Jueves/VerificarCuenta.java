public class VerificarCuenta implements Runnable{
  private CuentaBanco cb = new CuentaBanco();

  private synchronized void hacerRetiro(int cantidad){
    if(cb.getBalance() >= cantidad){
      System.out.println(Thread.currentThread().getName() + " esta realizando un retiro de: " + cantidad0);
      cb.retiroBancario(cantidad);
      System.out.println(Thread.currentThread()<.getName() + " :Retiro realizado");
      System.out.println(Thread.currentThread().getName() + " :Los fondos son de: " cb.getBalance());
    }else{
      System.out.println("No hay suficiente dinero en la cuenta para realizar el retiro. Sr." + Thread.currentThread().getName());
      System.out.println("Su saldo actual es de: " + cb.getBalance());
    }
  }
  @Override
  public void run(){
    for(int i=0;i<3;i++){
      this.hacerRetiro(10);
      if(cb.getBalance() < 0){
        System.out.println("La cuenta esta sobregirada");
      }
    }
  }
}
