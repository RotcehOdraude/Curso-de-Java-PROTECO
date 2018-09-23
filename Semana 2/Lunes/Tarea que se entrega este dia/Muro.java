import java.util.ArrayList;
//import java.util.List;

public class Muro{
  //Atributos
  ArrayList<CuboNegro> misCubos = new ArrayList<CuboNegro>();
  //Métodos
  public Muro(ArrayList<String> arreglo){
    int i = 0;
    for (String numero : arreglo) {
      setCuboNegro(i,Integer.parseInt(numero));
      i++;
    }
  }
  public void setCuboNegro(int posX,int posY){
    misCubos.add(new CuboNegro(posX,posY));
  }
  public String toString(){
    StringBuilder variable = new StringBuilder();
    int i = 1;
    for (CuboNegro cuboN : misCubos ) {
      variable.append("\tCubo " + i + "\n" + cuboN.toString() + "\n");
      i++;
    }
    return variable.toString();
  }

}
