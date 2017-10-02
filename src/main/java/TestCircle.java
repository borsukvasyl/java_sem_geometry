public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(String.format("Area = %f", circle1.area()));
        System.out.println(String.format("Perimeter = %f", circle1.perimeter()));
        System.out.println(String.format("Color = %d", circle1.getColor()));
        System.out.println(circle1);

        Circle circle2 = new Circle(2d);
        System.out.println(String.format("Area = %f", circle2.area()));
        System.out.println(String.format("Perimeter = %f", circle2.perimeter()));
        System.out.println(String.format("Color = %d", circle2.getColor()));
        System.out.println(circle2);

        Circle circle3 = new Circle(2d, 3);
        System.out.println(String.format("Area = %f", circle3.area()));
        System.out.println(String.format("Perimeter = %f", circle3.perimeter()));
        System.out.println(String.format("Color = %d", circle3.getColor()));
        System.out.println(circle3);
    }
}
