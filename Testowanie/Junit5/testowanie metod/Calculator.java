public class Calculator {
    public static double distance(Point a, Point b) {
        double xDist = a.getX() - b.getX();
        double yDist = a.getY() - b.getY();
        return Math.sqrt(xDist * xDist + yDist * yDist);
    }

    public static double rectangleArea(Rectangle rectangle) {
        double side1 = distance(rectangle.getP1(), rectangle.getP2());
        double side2 = distance(rectangle.getP2(), rectangle.getP3());
        return side1 * side2;
    }

    public static boolean isPointInsideCircle(Circle circle, Point point) {
        double distanceFromCenter = distance(circle.getS(), point);
        return distanceFromCenter <= circle.getR();
    }
}
