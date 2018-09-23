public class CuboNegro{
  //Atributos
  public int posX;
  public int alturaCubo;
  //Métodos
  public CuboNegro(int posX,int alturaCubo){
    this.posX = posX + 1;
    this.alturaCubo = alturaCubo;
  }
  public String toString(){
    return "Posicion en x: " + posX + "\nAltura del cubo: " + alturaCubo;
  }
}
