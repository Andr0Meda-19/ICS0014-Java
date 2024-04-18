package src.assessment;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
public class Cat {
    // Getters for Cat properties
    private String name;
    private String breed;
    private String furColor;
    private String eyeColor;
    private List<Toy> favoriteToys;

    public Cat(String name, String breed, String furColor, String eyeColor, List<Toy> favoriteToys) {
        this.name = name;
        this.breed = breed;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.favoriteToys = favoriteToys;
    }
    // Method to group cats by eye color
    public static Map<String, List<Cat>> groupCatsByEyeColor(List<Cat> cats) {
        return cats.stream().collect(Collectors.groupingBy(Cat::getEyeColor));
    }

    // Method to group cats by breed
    public static Map<String, List<Cat>> groupCatsByBreed(List<Cat> cats) {
        return cats.stream().collect(Collectors.groupingBy(Cat::getBreed));
    }

    // Method to get cats with a specific toy among their favorites
    public static List<Cat> getCatsWithFavoriteToy(List<Cat> cats, String toyName) {
        return cats.stream()
                .filter(cat -> cat.getFavoriteToys().stream().anyMatch(toy -> toy.getName().equals(toyName)))
                .collect(Collectors.toList());
    }

    // Method to get all favorite toys from a list of cats
    public static List<Toy> getAllFavoriteToys(List<Cat> cats) {
        List<Toy> allToys = new ArrayList<>();
        cats.forEach(cat -> allToys.addAll(cat.getFavoriteToys()));
        return allToys.stream().distinct().collect(Collectors.toList());
    }

    // Method to filter cats by a given property and value
    public static List<Cat> filterCatsByProperty(List<Cat> cats, String propertyName, String propertyValue) {
        return cats.stream()
                .filter(cat -> getProperty(cat, propertyName).equals(propertyValue))
                .collect(Collectors.toList());
    }

    // Helper method to get cat's property value based on property name
    private static String getProperty(Cat cat, String propertyName) {
        return switch (propertyName) {
            case "name" -> cat.getName();
            case "breed" -> cat.getBreed();
            case "furColor" -> cat.getFurColor();
            case "eyeColor" -> cat.getEyeColor();
            default -> throw new IllegalArgumentException("Invalid property name: " + propertyName);
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" the Cat is ").append(breed).append(", has ").append(furColor).append(" fur and ")
                .append(eyeColor).append(" eyes.\nFavorite Toys:\n");
        for (Toy toy : favoriteToys) {
            sb.append(toy.toString()).append("\n");
        }
        return sb.toString();
    }
}