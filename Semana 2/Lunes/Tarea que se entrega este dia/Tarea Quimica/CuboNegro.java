public class CuboNegro implements Cubo{
  //Atributos
  public int posX;
  public int posY;
  //Métodos
  public CuboNegro(int posX,int posY){
    this.posX = posX + 1;
    this.posY = posY + 1;
  }
  public String toString(){
    return "Posicion en x: " + posX + "\nPosicon en y" + posY;
  }
}
