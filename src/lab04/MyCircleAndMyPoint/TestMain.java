package lab04.MyCircleAndMyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(0, 0, 6);
        System.out.println(circle1);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        System.out.println(circle1.getCenter());
    }
}
