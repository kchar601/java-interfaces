import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList(); 
        animals.add(new Animal("Camel", 40, true));
        animals.add(new Animal("Horse", 55, true));
        animals.add(new Animal("Bear", 25, false));
        animals.add(new Animal("Donkey", 15, true));
        animals.add(new Animal("Elephant", 25, false));

        Collections.sort(animals);
        for (Animal a : animals) {
            System.out.print(a);
        };
    }
}
