package lab05.BouncingBalls;

public class Container {
    private double x1, y1; // Top-left corner
    private double x2, y2; // Bottom-right corner

    // Constructor
    public Container(double x, double y, double width, double height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1; // Convert to bottom-right corner
        this.y2 = y + height - 1; // Convert to bottom-right corner
    }

    // toString method
    public String toString() {
        return "Container at (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")";
    }

    // Check if the ball collides with the container
    public boolean collidesWith(Ball ball) {
        double left = ball.getX() - ball.getRadius();
        double right = ball.getX() + ball.getRadius();
        double top = ball.getY() - ball.getRadius();
        double bottom = ball.getY() + ball.getRadius();

        boolean collided = false;

        if (left <= x1 || right >= x2) {
            ball.reflectHorizontal();
            collided = true;
        }

        if (top <= y1 || bottom >= y2) {
            ball.reflectVertical();
            collided = true;
        }

        return collided;
    }

    public static void main(String[] args) {
        // Test the Container class
        Container container = new Container(0, 0, 100, 100); // (x, y, width, height)

        System.out.println("Container:");
        System.out.println(container);

        Ball ball = new Ball(50, 50, 10, 2, 45); // (x, y, radius, speed, direction)
        System.out.println("Initial Ball:");
        System.out.println(ball);

        System.out.println("After colliding with Container:");
        container.collidesWith(ball);
        System.out.println(ball);
    }
}
