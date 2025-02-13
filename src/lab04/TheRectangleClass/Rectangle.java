package lab04.TheRectangleClass;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(length + width);
    }

    public String toString() {
        return String.format("Rectangle [length = %S, width = %s]",
                length, width);
    }
}
