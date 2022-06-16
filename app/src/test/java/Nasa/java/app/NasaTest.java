package test.java.Nasa.java.app;


import main.java.Nasa.java.app.Nasa;
import main.resources.Robot;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NasaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    Nasa nasa = new Nasa();

    @Test
    public void createFIveByFiveMap() {
        List<Integer> map = nasa.buildMap(5, 5);
        assertEquals(5, map.get(0));
        assertEquals(5, map.get(1));
    }

    @Test
    public void northTurnRightOneTime() {
        Robot robot = new Robot(1, 2, 'N').turnRight();
        assertEquals('E', robot.getDirection());
    }

    @Test
    public void eastTurnRightOneTime() {
        Robot robot = new Robot(1, 2, 'E').turnRight();
        assertEquals('S', robot.getDirection());
    }

    @Test
    public void southTurnRightOneTime() {
        Robot robot = new Robot(1, 2, 'S').turnRight();
        assertEquals('W', robot.getDirection());
    }

    @Test
    public void westTurnRightOneTime() {
        Robot robot = new Robot(1, 2, 'W').turnRight();
        assertEquals('N', robot.getDirection());
    }

    @Test
    public void continuousRightTurnFromNorthDirection() {
        Robot robot = new Robot(1, 2, 'N').turnRight().turnRight();
        assertEquals('S', robot.getDirection());
    }

    @Test
    public void northTurnLeftOneTime() {
        Robot robot = new Robot(1, 2, 'N').turnLeft();
        assertEquals('W', robot.getDirection());
    }

    @Test
    public void eastTurnLeftOneTime() {
        Robot robot = new Robot(1, 2, 'E').turnLeft();
        assertEquals('N', robot.getDirection());
    }

    @Test
    public void southTurnLeftOneTime() {
        Robot robot = new Robot(1, 2, 'S').turnLeft();
        assertEquals('E', robot.getDirection());
    }

    @Test
    public void westTurnLeftOneTime() {
        Robot robot = new Robot(1, 2, 'W').turnLeft();
        assertEquals('S', robot.getDirection());
    }

    @Test
    public void continuousLeftTurnFromNorthDirection() {
        Robot robot = new Robot(1, 2, 'N').turnLeft().turnLeft();
        assertEquals('S', robot.getDirection());
    }

    @Test
    public void turnLeftThenTurnRightFromNorthDirection() {
        Robot robot = new Robot(1, 2, 'N').turnRight().turnLeft();
        assertEquals('N', robot.getDirection());
    }

    @Test
    public void walkOneStepFromNorthDirection() {
        Robot robot = new Robot(1, 2, 'N').walk();
        assertEquals(3, robot.getY());
    }
}