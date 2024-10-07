import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5, 10, 3.0);
        Shape square = new Square(8, 3, 4.0);
        Shape rectangle = new Rectangle(2, 1, 6.0, 2.0);
        Shape anotherSquare = new Square(8, 1, 4.0);


        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(rectangle);
        shapes.add(anotherSquare);


        OrderPrinter printer = new OrderPrinter();
        printer.printOrderedShapes(shapes);


    }
}
