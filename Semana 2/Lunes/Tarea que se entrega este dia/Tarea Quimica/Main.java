import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Hola, escribe por favor un arreglo con la altura de tu muro con el siguiente formato [a,b,c,...]: ");
    Muro prebeMuro = new Muro(stringToArrayList(scan.nextLine()));
    System.out.println(prebeMuro.toString());//pendiente...
    prebeMuro.llenarConAgua();
  }



  //Otros métodos útiles....
  public static ArrayList<Integer> stringToArrayList(String arreglo){
    String replace = arreglo.replaceAll("^\\[|]$", "");
    System.out.println(replace);
    ArrayList<String> lista = new ArrayList<String>(Arrays.asList(replace.split(",")));
    ArrayList<Integer> listaInt = new ArrayList<Integer>();
    for (String s :lista ) {
      listaInt.add(Integer.parseInt(s));
    }
    return listaInt;
  }
}
