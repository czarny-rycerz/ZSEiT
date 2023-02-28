import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testUnit {

    private Unit unit;

    @BeforeEach
    void setUp() {
        Coordinates startCoordinates = new Coordinates(0, 0);
        int maxFuel = 100;
        int maxCargoWeight = 50;
        unit = new Unit(startCoordinates, maxFuel, maxCargoWeight);
    }
    //ustawia dane maksymalnego kordynatow, paliwa i wagi ladunku

    @Test
    void shouldTankUp() {
        unit.tankUp();

        assertTrue(unit.getFuel() > 0);
        assertTrue(unit.getFuel() <= unit.getFuel());
    }
    //paliwo powinno wynosić lub być poniżej 100

    @Test
    void shouldThrowException() {
        assertThrows(IllegalStateException.class, () -> unit.move(50, 50));
    }

    @Test
    void shouldLoad() {
        Cargo cargo = new Cargo("Test Cargo", 10);

        unit.loadCargo(cargo);

        assertTrue(unit.getLoad() == cargo.getWeight());
        assertEquals(cargo.getWeight(), unit.getLoad());
    }
// pobiera aktualną wage towaru i dodaje wskazana "waga nie może być większa niż maksymalna"

    @Test
    void shouldUnload() {
        Cargo cargo = new Cargo("Cargo", 10);
        unit.loadCargo(cargo);

        unit.unloadCargo(cargo);

        assertFalse(unit.getLoad() == cargo.getWeight());
        assertEquals(0, unit.getLoad());
    }
// usuwa ladunek
    @Test
    void shouldUnloadAll() {
        Cargo cargo1 = new Cargo("Cargo1", 10);
        Cargo cargo2 = new Cargo("Cargo2", 20);
        unit.loadCargo(cargo1);
        unit.loadCargo(cargo2);

        unit.unloadAllCargo();

        assertTrue(unit.getLoad() == 0);
        assertEquals(0, unit.getLoad());
    }
}