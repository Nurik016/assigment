import java.util.Scanner;
import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;

public class MyApplication {
    public static void main(String[] args) {
        String filePath = "C:/Users/Nurik/IdeaProjects/assigment/src/source";
        File file = new File(filePath);

        try (Scanner sc = new Scanner(file)) {
            Shape shape = new Shape();
            while (sc.hasNextDouble()) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                Point point = new Point(x, y);
                shape.addPoint(point);
            }
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("Longest Distance: " + shape.getLongest());
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }

        Point point1 = new Point(1, 2);
        System.out.println(point1);
    }
}
