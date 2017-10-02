public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
        this.setColor(1);
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.setColor(1);
    }

    public Rectangle(double length, double width, int color){
        this.length = length;
        this.width = width;
        this.setColor(color);
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        return String.format("Rectangle with length=%f, width=%f and colour=%d", this.length, this.width, this.getColor());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
