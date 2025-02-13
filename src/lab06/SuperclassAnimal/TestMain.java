package lab06.SuperclassAnimal;

public class TestMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("A");
        Dog dog2 = new Dog("C");
        Cat cat = new Cat("B");
        System.out.println(dog1.toString());
        dog1.greets(dog2);
    }
}
