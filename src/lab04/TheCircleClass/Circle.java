package lab04.TheCircleClass;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return String.format("Circle[radius = %s, color = %s]",
                this.radius, this.color);
    }

    public double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }
}
