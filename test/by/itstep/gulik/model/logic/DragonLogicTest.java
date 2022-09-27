package by.itstep.gulik.model.logic;

import by.itstep.gulik.model.data.Dragon;
import static org.junit.Assert.*;
import org.junit.Test;

public class DragonLogicTest {

    @Test
    public void testFirstPeriodPositive() {
        // arrange
        Dragon dragon = new Dragon();
        dragon.age = 10;
        int expected = 33;

        // act
        int actual = DragonLogic.calculateHeads(dragon);

        assertEquals(expected, actual);
    }

    @Test
    public void testNegative() {
        // arrange
        Dragon dragon = new Dragon();
        dragon.age = -10;
        int expected = -1;

        // act
        int actual = DragonLogic.calculateHeads(dragon);

        assertEquals(expected, actual);
    }


    @Test
    public void testFirstBoundPositive() {
        // arrange
        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.FIRST_PERIOD;
        int expected = 303;

        // act
        int actual = DragonLogic.calculateHeads(dragon);

        assertEquals(expected, actual);
    }

}
