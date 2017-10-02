public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(String.format("Area = %f", rectangle1.area()));
        System.out.println(String.format("Perimeter = %f", rectangle1.perimeter()));
        System.out.println(String.format("Color = %d", rectangle1.getColor()));
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(12, 2);
        System.out.println(String.format("Area = %f", rectangle2.area()));
        System.out.println(String.format("Perimeter = %f", rectangle2.perimeter()));
        System.out.println(String.format("Color = %d", rectangle2.getColor()));
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(8, 3, 3);
        System.out.println(String.format("Area = %f", rectangle3.area()));
        System.out.println(String.format("Perimeter = %f", rectangle3.perimeter()));
        System.out.println(String.format("Color = %d", rectangle3.getColor()));
        System.out.println(rectangle3);
    }
}
