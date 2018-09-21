import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("##### MENU #####");
    System.out.println("Selecione una opcion: ");
    System.out.println("1) Sumar \n2) Restar\n3) Multiplicar\n4) Dividir\n5) Sacar ángulo\n6) Sacar magnitud\n7) ...");
    int opcion = scan.nextInt();
    switch (opcion) {
      case 1:
        System.out.println("Escribe complejo A: ");
        Complejo a = capturar();
        System.out.println("Escribe complejo B: ");
        Complejo b = capturar();
        Calculadora.sumar(a,b);
        break;
      case 2:
        System.out.println("Escribe complejo A: ");
        a = capturar();
        System.out.println("Escribe complejo B: ");
        b = capturar();
        Calculadora.restar(a,b);
        break;
      case 3:
        System.out.println("Escribe complejo A: ");
        a = capturar();
        System.out.println("Escribe complejo B: ");
        b = capturar();
        Calculadora.multiplicar(a,b);
        break;
      case 4:
        System.out.println("Escribe complejo A: ");
        a = capturar();
        System.out.println("Escribe complejo B: ");
        b = capturar();
        Calculadora.dividir(a,b);
        break;
      case 5:
        System.out.println("Escribe complejo A: ");
        a = capturar();
        Calculadora.angulo(a);
        break;
      case 6:
        System.out.println("Escribe complejo A: ");
        a = capturar();
        Calculadora.magnitud(a);
        break;
      default:
        System.out.println("Opcion invalida");
    }
  }
  public static Complejo capturar(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Escribe parte real: ");
    double real = scan.nextDouble();
    System.out.print("Escribe parte imaginario: ");
    double imaginario = scan.nextDouble();
    return new Complejo(real,imaginario);
  }
}
