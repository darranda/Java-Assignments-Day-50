import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

            ArrayList <Animal> animals = new ArrayList <>();
            System.out.println ("Animal Menu");
            System.out.println ("Entering nothing will stop the loop");

            while (true) {

            System.out.println ("Please enter a name:");
            String name = scanner.nextLine();

                if (name.equals("")) {
                    break;
                }

                System.out.print("Is it a dog? Yes or no: ");
                String response = scanner.nextLine();
                boolean dog = response.equalsIgnoreCase("Yes");
                animals.add(new Animal(name, dog));
            }

        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}
