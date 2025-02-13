package lab04.MyRectangleAndMyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(0, 0, 10, 5);
        System.out.println(rectangle1);

        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
