import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class OrderPrinter {

    public void printOrderedShapes(List<Shape> shapes) {

        Collections.sort(shapes, Comparator
                .comparingDouble(Shape::calculateArea)
                .thenComparingInt(Shape::getX)
                .thenComparingInt(Shape::getY));

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName() +
                    " | Area: " + shape.calculateArea() +
                    " | X: " + shape.getX() +
                    " | Y: " + shape.getY());


        }
    }
}

