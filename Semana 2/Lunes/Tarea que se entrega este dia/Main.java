import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Hola, escribe por favor un arreglo con la altura de tu muro con el siguiente formato [a,b,c,...]: ");
    Muro prebeMuro = new Muro(stringToArrayList(scan.nextLine()));
    //prebeMuro.imprimirMuro();
  }
  public static ArrayList<String> stringToArrayList(String arreglo){
    String replace = arreglo.replaceAll("^\\[|]$", "");
    ArrayList<String> lista = new ArrayList<String>(Arrays.asList(replace.split(",")));
    return lista;
  }
}
