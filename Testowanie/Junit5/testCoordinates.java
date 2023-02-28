import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class testCoordinates {


    @Test
    public void testCoordinatesGreater100() {
        int x = 50;
        int y = 101;
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(x, y));
    }
// kordynat Y powinien być wiekszy od 100
    @Test
    public void testValid() {
        int x = 80;
        int y = 90;
        Coordinates coordinates = new Coordinates(x, y);
        assertEquals(x, coordinates.getX());
        assertEquals(y, coordinates.getY());
    }
// kordynaty powinny byc poniżej 100
    @Test
    public void testNotEquals() {
        Coordinates coordinates1 = new Coordinates(70, 80);
        Coordinates coordinates2 = new Coordinates(20, 50);
        assertFalse(coordinates1.equals(coordinates2));
    }
    // kordynaty nie mogą być takie same
    @Test
    public void testNegative() {
        int x = -7;
        int y = 50;
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(x, y));
    }
// kordynat x powinien być na minusie
    @Test
    public void testEquals() {
        Coordinates coordinates1 = new Coordinates(60, 90);
        Coordinates coordinates2 = new Coordinates(60, 90);
        assertTrue(coordinates1.equals(coordinates2));
    }
// kordynaty powinny być prawidlowe
    @Test
    public void testCopy() {
        Coordinates originalCoordinates = new Coordinates(8, 20);
        int x = 90;
        int y = -6;
        Coordinates newCoordinates = Coordinates.copy(originalCoordinates, x, y);
        assertEquals(originalCoordinates.getX() + x, newCoordinates.getX());
        assertEquals(originalCoordinates.getY() + y, newCoordinates.getY());
    }
    //dodaje do siebie  kordynaty wynik nie powinien być powyżej 100
}