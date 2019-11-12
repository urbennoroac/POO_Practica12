import java.util.ArrayList;
class Animal_{
	private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal_(String speciesName, boolean hopper, boolean swimmer){
      	species = speciesName;
       	canHop = hopper;
       	canSwim = swimmer;
    }
    public boolean canHop(){
	    return canHop;
    }
    public boolean canSwim(){
    	return canSwim;
	}
    public String toString(){
	    return species;
    }
}
interface CheckTrait{
    boolean test(Animal_ a);
}
class CheckIfHopper implements CheckTrait{
    public boolean test(Animal_ a){
     	return a.canHop();
    }
}
class CheckIfSwimer implements CheckTrait{
    public boolean test(Animal_ a){
     	return a.canSwim();
    }
}
public class TraditionalSearch extends CheckIfHopper{
    public static void main(String[] args){
	    ArrayList <Animal_>animals = new ArrayList<Animal_>();
        animals.add(new Animal_("fish", false, true));
        animals.add(new Animal_("kangaroo", true, false));
        animals.add(new Animal_("rabbit", true, false));
        animals.add(new Animal_("turtle", false, true));
        System.out.println("Animales que saltan: ");
        print(animals, new CheckIfHopper());
        System.out.println("Animales que nadan: ");
        print(animals, new CheckIfSwimer());
        System.out.println("Animales que nadan y saltan usando expresion lambda: ");
        animals.forEach(System.out::println);
    }
    private static void print(ArrayList <Animal_> animals, CheckTrait checker){
        for(Animal_ animal: animals){
	        if(checker.test(animal))
    	    	System.out.print(animal + "");
        }
        System.out.println();
     }
}