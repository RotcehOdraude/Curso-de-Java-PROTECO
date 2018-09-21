public class Calculadora{
  public static Complejo sumar(Complejo a, Complejo b){
    return new Complejo(a.real + b.real,a.imaginario + b.imaginario);
  }
  public static Complejo restar(Complejo a, Complejo b){
    return new Complejo(a.real - b.real,a.imaginario - b.imaginario);
  }
  public static Complejo multiplicar(Complejo a, Complejo b){
    return new Complejo(a.real * b.real + a.imaginario * b.imaginario,a.imaginario * b.real - a.real * b.imaginario);
  }
  public static Complejo dividir(Complejo a, Complejo b){
    double denominador = (Math.pow(b.real,2) + Math.pow(b.imaginario,2));
    double parteReal = (a.real * b.imaginario + a.imaginario * b.imaginario)/denominador;
    double parteImaginaria = (a.imaginario * b.real - a.real * b.imaginario)/denominador;
    return new Complejo(parteReal,parteImaginaria);
  }
  public static double angulo(Complejo a){
    return Math.atan(a.imaginario/a.real);
  }
  public static double magnitud(Complejo a){
    return Math.sqrt(Math.pow(a.real,2) + Math.pow(a.imaginario,2));
  }
}
