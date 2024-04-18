package src.assessment;

import lombok.Getter;

public class Toy {
    @Getter
    private String name;
    private String color;

    public Toy(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return name + ", " + color + " color";
    }
}