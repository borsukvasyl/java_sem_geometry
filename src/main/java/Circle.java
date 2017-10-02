public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1;
        this.setColor(1);
    }

    public Circle(double radius) {
        this.radius = radius;
        this.setColor(1);
    }

    public Circle(double r, int color) {
        this.radius = r;
        this.setColor(color);
    }

    public double area() {
        return Math.PI * this.radius;
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {

        return String.format("Circle with R=%f and colour=%d", this.radius, this.getColor());
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
