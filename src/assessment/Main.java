package src.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final List<String> possibleCatNames = List.of("Whiskers", "Mittens", "Shadow", "Felix", "Luna", "Simba");
    private static final List<String> possibleCatBreeds = List.of("Persian", "Siamese", "Maine Coon", "Sphynx", "Bengal");
    private static final List<String> possibleFurColors = List.of("White", "Black", "Gray", "Brown", "Orange", "Cream");
    private static final List<String> possibleEyeColors = List.of("Blue", "Green", "Yellow", "Amber", "Hazel");
    private static final List<String> possibleToyNames = List.of("Ball", "Mouse", "Feather", "String", "Fish", "Squeaky Toy");
    private static final List<String> possibleToyColors = List.of("Red", "Blue", "Green", "Yellow", "Pink");

    public static void main(String[] args) {
        // Creating cats

        List<Cat> cats = generateRandomCats(5);

        // Printing list of cats
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
    public static List<Cat> generateRandomCats(int numberOfCats) {
        List<Cat> cats = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfCats; i++) {
            String name = possibleCatNames.get(random.nextInt(possibleCatNames.size()));
            String breed = possibleCatBreeds.get(random.nextInt(possibleCatBreeds.size()));
            String furColor = possibleFurColors.get(random.nextInt(possibleFurColors.size()));
            String eyeColor = possibleEyeColors.get(random.nextInt(possibleEyeColors.size()));

            List<Toy> favoriteToys = generateRandomToys(random.nextInt(4) + 1); // Generate 1 to 4 random toys

            cats.add(new Cat(name, breed, furColor, eyeColor, favoriteToys));
        }

        return cats;
    }
    public static List<Toy> generateRandomToys(int numberOfToys) {
        List<Toy> toys = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfToys; i++) {
            String name = possibleToyNames.get(random.nextInt(possibleToyNames.size()));
            String color = possibleToyColors.get(random.nextInt(possibleToyColors.size()));

            toys.add(new Toy(name, color));
        }

        return toys;
    }
}
