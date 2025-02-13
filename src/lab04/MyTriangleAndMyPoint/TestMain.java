package lab04.MyTriangleAndMyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 0, 1, 1, 0);
        System.out.println(triangle1);

        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());
    }
}
