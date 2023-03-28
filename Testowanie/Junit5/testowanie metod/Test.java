public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(4, 6);
        Point p2 = new Point(8, 5);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(1, 3);

        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        System.out.println("Pole powierzchni prostokąta: " + Calculator.rectangleArea(rectangle));

        Point s = new Point(10, 12);
    }
}

