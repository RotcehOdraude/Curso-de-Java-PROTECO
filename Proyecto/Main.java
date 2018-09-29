import java.util.ArrayList;
public class Main{
  public static void main(String[] args) {
    ArrayList <Animal> zoologico = new ArrayList<Animal>();
    zoologico.add(new Carnivoro("tigre","Personas"));
    zoologico.add(new Herbivoro("antílope","Carol"));
    zoologico.get(1).jugar();
    zoologico.get(2).jugar();
    Carnivoro mufasa = (Carnivoro) zoologico.get(1);
    mufasa.comer(zoologico.get(2));
  }
}
