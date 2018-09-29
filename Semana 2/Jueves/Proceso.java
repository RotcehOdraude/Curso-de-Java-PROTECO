public class Proceso extends Thread{
  String mensaje;

  public Proceso(String nombre){
    super(nombre);
  }
  public void setMensaje(String mensaje){
      this.mensaje = mensaje;
  }
  @Override
  public void run(){
    for (int i = 0;i < 10;i++){
      System.out.println("Numero: " + i + " " + mensaje);
    }
    //System.out.println(mensaje);
    System.out.println("Este hilo ha terminado " + this.getName());

  }
}
