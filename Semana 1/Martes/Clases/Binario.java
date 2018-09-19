import java.util.Scanner;
public class Binario{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero");
    System.out.println((Integer.toBinaryString(sc.nextInt())));
  }
}
