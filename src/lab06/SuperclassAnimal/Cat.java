package lab06.SuperclassAnimal;

public class Cat extends Mammal {
    // constructor
    public Cat(String name) {
        super(name);
    }

    // Method
    public void greets() {
        System.out.println("Meow");
    }

    public String toString() {
        return String.format("Cat[%s]");
    }
}
