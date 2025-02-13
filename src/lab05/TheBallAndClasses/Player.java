package lab05.TheBallAndClasses;

public class Player {
    private String name;
    private double x, y;

    public Player(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

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

    public void kick(Ball ball, double kickSpeed, double kickDirection) {
        // Assuming kick will change ball's direction and speed
        ball.setXDelta(kickSpeed * Math.cos(Math.toRadians(kickDirection)));
        ball.setYDelta(-kickSpeed * Math.sin(Math.toRadians(kickDirection))); // Negative for inverted y-axis
    }

    public String toString() {
        return "Player " + name + " at (" + x + ", " + y + ")";
    }
}

