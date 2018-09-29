public class Herbivoro implements Animal{
//---------- atributos ---------------
  String comidaFavorita;
  String tipoAnimal;
//---------- metodos ------------------
  public Herbivoro(String tipoAnimal, String comidaFavorita){
    this.tipoAnimal = tipoAnimal;
    this.comidaFavorita = comidaFavorita;
  }
  public void jugar(){
    System.out.println("Estoy bailando ...");
  }
  public void comer(Animal a);
}
