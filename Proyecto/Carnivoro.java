public class Carnivoro implements Animal{
//---------- atributos --------------
  String comidaFavorita;
  String tipoAnimal;
//---------- metodos ---------------
  public Carnivoro(String tipoAnimal, String comidaFavorita){
    this.tipoAnimal = tipoAnimal;
    this.comidaFavorita = comidaFavorita;
  }
  public void jugar(){
    System.out.println("Estoy cantando ");
  }
  public void comer(Animal a){
    if (a.getClass() == Carnivoro) {
      Carnivoro algunAnimal = (Carnivoro) a;
    }else{
      Herbivoro algunAnimal = (Herbivoro) a;
    }
    System.out.println("Este " + algunAnimal.tipoAnimal + "esta delicioso ... :9");
  }
}
