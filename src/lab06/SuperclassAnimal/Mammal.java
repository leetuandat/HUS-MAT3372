package lab06.SuperclassAnimal;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return String.format("Mammal[Animal[name = %s]]", super.toString());
    }
}
