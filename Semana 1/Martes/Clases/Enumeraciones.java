public class Enumeraciones{

  public enum Semana{
    Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
  }//Esta es la sintaxis de las enumeraciones, no necesita ;
  public static void main(String[] args) {
    Semana s = Semana.Lunes;
    int a = 4;
    System.out.println(a + "4");
    for(Semana f:s.values()){
      System.out.printf("%s","<Hoy es: " + s);
    }
    String cad = "hola";
    String cad2 = "hola";

    if(cad.equals(cad2)){
      System.out.println("Son iguales ");
    }
  }
}
