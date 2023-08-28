import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        while (true) {
            System.out.print("Ingrese el nombre del animal: ");
            String name = scanner.nextLine();

            System.out.print("Ingrese la especie del animal: ");
            String species = scanner.nextLine();

            System.out.print("Ingrese las características del animal: ");
            String features = scanner.nextLine();

            System.out.print("Ingrese lo que le gustó más a su hermana del animal: ");
            String favoriteFeature = scanner.nextLine();

            if (name.equalsIgnoreCase("salir")) {
                break;
            }

            Animal animal = new Animal(name, species, features, favoriteFeature);
            animals.add(animal);
        }

        for (Animal animal : animals) {
            System.out.println("\nNombre: " + animal.getName());
            System.out.println("Especie: " + animal.getSpecies());
            System.out.println("Características: " + animal.getFeatures());
            System.out.println("Lo que le gustó más a su hermana: " + animal.getFavorite());
        }
    }
}