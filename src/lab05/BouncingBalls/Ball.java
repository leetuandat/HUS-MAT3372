package lab05.BouncingBalls;

public class Ball {
    private double x, y; // Center coordinates
    private double radius;
    private double xDelta, yDelta; // Displacement per step

    // Constructor
    public Ball(double x, double y, double radius, double speed, double direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * Math.sin(Math.toRadians(direction)); // Negative for inverted y-axis
    }

    // Getters and setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getXDelta() {
        return xDelta;
    }

    public void setXDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getYDelta() {
        return yDelta;
    }

    public void setYDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    // Move the ball by one step
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Reflect horizontally (hits a vertical wall)
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Reflect vertically (hits a horizontal wall)
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // toString method
    public String toString() {
        return "Ball at (" + x + ", " + y + ") with velocity (" + xDelta + ", " + yDelta + ")";
    }

    public static void main(String[] args) {
        // Test the Ball class
        Ball ball = new Ball(100, 100, 10, 2, 45); // (x, y, radius, speed, direction)

        System.out.println("Initial Ball:");
        System.out.println(ball);

        ball.move();
        System.out.println("After one move:");
        System.out.println(ball);

        ball.reflectHorizontal();
        System.out.println("After horizontal reflection:");
        System.out.println(ball);

        ball.reflectVertical();
        System.out.println("After vertical reflection:");
        System.out.println(ball);
    }
}

