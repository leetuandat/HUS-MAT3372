package lab06.SuperclassAnimal;

public class Dog extends Mammal {
    // constructor
    public Dog(String name) {
        super(name);
    }

    // Method
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    public String toString() {
        return String.format("Dog[%s]", super.toString());
    }
}
