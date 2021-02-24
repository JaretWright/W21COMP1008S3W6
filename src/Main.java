import java.time.LocalDate;
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

        //This area will be used for testing our Employee's
        HourlyEmployee emp1 = new HourlyEmployee("Sven","Tankian", LocalDate.of(1987,2,24), 16);
        HourlyEmployee emp2 = new HourlyEmployee("Maria","Bella", LocalDate.of(2000,4,01), 20);
        CommisionEmployee emp3 = new CommisionEmployee("Cosmo","Kramer",
                                                        LocalDate.of(1976,4,01), 0.3);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
