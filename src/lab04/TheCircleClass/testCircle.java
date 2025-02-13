package lab04.TheCircleClass;

public class testCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.printf("The circle has radius of %s and area of %s and color %s\n",
                circle1.getRadius(), circle1.getArea(), circle1.getColor());
        System.out.printf("Circumference is: %s\n", circle1.getCircumference());

        Circle circle2 = new Circle(3.0);
        System.out.println(circle2);
        System.out.printf("The circle has radius of %s and area of %s and color %s\n",
                circle2.getRadius(), circle2.getArea(), circle2.getColor());
        System.out.printf("Circumference is: %s\n", circle2.getCircumference());

        Circle circle3 = new Circle(5.0, "blue");
        System.out.println(circle3);
        System.out.printf("The circle has radius of %s and area of %s and color %s\n",
                circle3.getRadius(), circle3.getArea(), circle3.getColor());
        System.out.printf("Circumference is: %s\n", circle3.getCircumference());
    }
}
