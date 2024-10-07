import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases {

    @Test
    public void testShapeCreation() {
        Circle circle = new Circle(5, 10, 3.0);
        Square square = new Square(8, 3, 4.0);
        Rectangle rectangle = new Rectangle(2, 1, 6.0, 2.0);

        assertEquals(5, circle.getX());
        assertEquals(10, circle.getY());
        assertEquals(8, square.getX());
        assertEquals(3, square.getY());
        assertEquals(2, rectangle.getX());
        assertEquals(1, rectangle.getY());
    }

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(0, 0, 3.0);
        double expectedArea = Math.PI * 3.0 * 3.0;
        assertEquals(expectedArea, circle.calculateArea(), 0.001);

    }
    @Test
    public void testSquareArea() {
        Square square = new Square(0, 0, 4.0);
        double expectedArea = 4.0 * 4.0;
        assertEquals(expectedArea, square.calculateArea(), 0.001);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(0, 0, 6.0, 2.0);
        double expectedArea = 6.0 * 2.0;
        assertEquals(expectedArea, rectangle.calculateArea(), 0.001);
    }

    @Test
    public void testSortingByArea() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(0, 0, 4.0));
        shapes.add(new Circle(0, 0, 2.0));
        shapes.add(new Rectangle(0, 0, 3.0, 3.0));

        OrderPrinter printer = new OrderPrinter();
        printer.printOrderedShapes(shapes);

        assertEquals(9.0, shapes.get(0).calculateArea(), 0.001);
        assertEquals(12.566370614359172, shapes.get(1).calculateArea(), 0.001);
        assertEquals(16.0, shapes.get(2).calculateArea(), 0.001);
    }

    @Test
    public void testSortingByXPosition() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 0, 4.0));
        shapes.add(new Square(3, 0, 4.0));
        shapes.add(new Square(8, 0, 4.0));

        OrderPrinter printer = new OrderPrinter();
        printer.printOrderedShapes(shapes);

        assertEquals(3, shapes.get(0).getX());
        assertEquals(5, shapes.get(1).getX());
        assertEquals(8, shapes.get(2).getX());
    }

    @Test
    public void testSortingByYPosition() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 10, 4.0));
        shapes.add(new Square(5, 5, 4.0));
        shapes.add(new Square(5, 15, 4.0));

        OrderPrinter printer = new OrderPrinter();
        printer.printOrderedShapes(shapes);

        assertEquals(5, shapes.get(0).getY());
        assertEquals(10, shapes.get(1).getY());
        assertEquals(15, shapes.get(2).getY());
    }

    @Test
    public void testSortingByMultipleCriteria() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, 10, 2.0));
        shapes.add(new Square(3, 5, 4.0));
        shapes.add(new Rectangle(3, 5, 3.0, 3.0));
        shapes.add(new Square(3, 2, 4.0));

        OrderPrinter printer = new OrderPrinter();
        printer.printOrderedShapes(shapes);

        assertEquals(9.0, shapes.get(0).calculateArea(), 0.001);
        assertEquals(12.566370614359172, shapes.get(1).calculateArea(), 0.001);
        assertEquals(16.0, shapes.get(2).calculateArea(), 0.001);
        assertEquals(16.0, shapes.get(3).calculateArea(), 0.001);
    }

    @Test
    public void testNegativeCoordinates() {
        Shape circle = new Circle(-5, -10, 2.0);
        Shape square = new Square(-3, -3, 4.0);

        assertEquals(-5, circle.getX());
        assertEquals(-10, circle.getY());
        assertEquals(-3, square.getX());
        assertEquals(-3, square.getY());
    }

    @Test
    public void testSameCoordinatesAndArea() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 5, 4.0));
        shapes.add(new Square(5, 5, 4.0));

        OrderPrinter printer = new OrderPrinter();
        printer.printOrderedShapes(shapes);

        assertEquals(5, shapes.get(0).getX());
        assertEquals(5, shapes.get(0).getY());
        assertEquals(16.0, shapes.get(0).calculateArea(), 0.001);

        assertEquals(5, shapes.get(1).getX());
        assertEquals(5, shapes.get(1).getY());
        assertEquals(16.0, shapes.get(1).calculateArea(), 0.001);
    }








}
