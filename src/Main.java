import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricShapes> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 20));
        shapes.add(new Rectangle(30, 30));
        shapes.add(new Circle(14));
        shapes.add(new Circle(10));
//        shapes.add("This is my String");

        for (GeometricShapes shape : shapes)
        {
            System.out.printf("%s has area: %.1f%n", shape.toString(), shape.getArea());
        }
    }
}
