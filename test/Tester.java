import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tester {
    @Test
    public void testGetNumberOfDoorsVolvoOK() {
        Volvo240 volvo = new Volvo240();

        int nrDoors = volvo.getNrDoors();

        assertTrue(nrDoors == 4);
    }

    @Test
    public void testGetNumberOfDoorsSaabOK() {
        Saab95 saab = new Saab95();

        int nrDoors = saab.getNrDoors();

        assertTrue(nrDoors == 2);
    }

    @Test
    public void testMoveOK() {
        Saab95 saab = new Saab95();
        double speedBefore = saab.getCurrentSpeed();
        saab.gas(0.7);
        double currSpeed = saab.getCurrentSpeed();

        saab.move();

        assertTrue(currSpeed >= speedBefore);
    }
}
