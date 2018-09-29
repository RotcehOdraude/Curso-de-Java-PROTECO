public class Prueba{
  public static void main(String[] args) {
    VerificarCuenta vc = new VerificarCuenta();
    Thread hilo1 = new Thread(vc, "Poli");
    Thread hilo2 = new Thread(vc, "Mayito");

    hilo1.start();
    hilo2.start();
  }
}
