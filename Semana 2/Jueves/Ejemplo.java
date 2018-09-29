public class Ejemplo{
  public static void main(String[] args) throws InterruptedException{
    Proceso hilo1 = new Proceso("Hilo 1");
    Proceso hilo2 = new Proceso("Hilo 2");
    hilo1.setMensaje("Este es el mensaje del hilo 1");
    hilo2.setMensaje("Este es el mensaje del hilo 2");
    System.out.println(Thread.currentThread().getName());
    hilo1.start();//Ejecutamos el hilo 1
    hilo1.join();//Esperamos a que se muera el hilo 1
    hilo2.start();//Ejecutamos el hilo 2

  }
}
