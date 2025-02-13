package lab04.MyLineAndMyPoint;
import lab04.MyLineAndMyPoint.MyLine;
public class TestMain {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 0, 5);
        System.out.println(line1);

        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }
}
