package lab07.ex1p8;

public class TestMove {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 10, 20, 35);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(10, 20, 30, 45, 25);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
