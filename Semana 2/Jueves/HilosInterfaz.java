public class HilosInterfaz implements Runnable{

  @Override
  public void run("Hola");
}

class Test{
  public static void main(String[] args) {
    new Thread(new HilosInterfaz()).start(); 
  }
}
