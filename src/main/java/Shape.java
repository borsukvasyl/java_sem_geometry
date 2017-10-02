public abstract class Shape {
    private int color;

    abstract public double area();
    abstract public double perimeter();

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
