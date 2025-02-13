package lab05.TheBallAndClasses;

public class Ball {
    private double x, y; // Center coordinates
    private double radius;
    private double xDelta, yDelta; // Displacement per step

    public Ball(double x, double y, double radius, double speed, double direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * Math.sin(Math.toRadians(direction)); // Negative for inverted y-axis
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

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public String toString() {
        return "Ball at (" + x + ", " + y + ") with velocity (" + xDelta + ", " + yDelta + ")";
    }
}

