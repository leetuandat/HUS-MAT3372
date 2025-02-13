package lab06.SuperclassShape;

public class TestMain {
    public static void main(String[] args) {
        Square square = new Square(6, "black", true);
        Rectangle rectangle = new Rectangle(6 , 9, "blue", true);
        Circle circle1 = new Circle(7.5, "green", true);
        Circle circle2 = new Circle(0.0, "green", false);
        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}
