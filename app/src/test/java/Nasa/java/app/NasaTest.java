package test.java.Nasa.java.app;

import main.resources.Map;
import main.resources.Robot;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class NasaTest {

    static int X_VALUE = 1;
    static int Y_VALUE = 2;

    @Test
    public void shouldCreateNewMapWhenGet_X_And_Y() {
        Map map = new Map(5, 5);

        assertEquals(5, map.getX());
        assertEquals(5, map.getY());
    }

    @Test
    public void shouldGet_E_WhenNorthGetCommand_R() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'N');

        Robot resultRobot = robot.getCommand("R");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('E', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_S_WhenEastGetCommand_R() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'E');

        Robot resultRobot = robot.getCommand("R");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('S', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_W_WhenWestGetCommand_R() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'S');

        Robot resultRobot = robot.getCommand("R");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('W', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_N_WhenWestGetCommand_R() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'W');

        Robot resultRobot = robot.getCommand("R");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('N', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_S_WhenNorthGetCommand_RR() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'N');

        Robot resultRobot = robot.getCommand("RR");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('S', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_W_WhenNorthGetCommand_L() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'N');

        Robot resultRobot = robot.getCommand("L");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('W', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_S_WhenWestGetCommand_L() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'W');

        Robot resultRobot = robot.getCommand("L");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('S', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_E_WhenSouthGetCommand_L() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'S');

        Robot resultRobot = robot.getCommand("L");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('E', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_N_WhenEastGetCommand_L() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'E');

        Robot resultRobot = robot.getCommand("L");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('N', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_N_WhenNorthGetCommand_RL() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'N');

        Robot resultRobot = robot.getCommand("RL");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('N', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_YPlus1_WhenNorthGetCommand_M() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'N');

        Robot resultRobot = robot.getCommand("M");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE + 1, resultRobot.getY());
        assertEquals('N', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_XPlus1_WhenEastGetCommand_M() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'E');

        Robot resultRobot = robot.getCommand("M");

        assertEquals(X_VALUE + 1, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('E', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_YDelete1_WhenSouthGetCommand_M() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'S');

        Robot resultRobot = robot.getCommand("M");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE - 1, resultRobot.getY());
        assertEquals('S', resultRobot.getDirection());
    }

    @Test
    public void shouldGet_XDelete1_WhenWestGetCommand_M() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'W');

        Robot resultRobot = robot.getCommand("M");

        assertEquals(X_VALUE - 1, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('W', resultRobot.getDirection());
    }

    @Test
    public void shouldGetNewResultWhenNorthGetCommand_RML() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'N');

        Robot resultRobot = robot.getCommand("RML");

        assertEquals(X_VALUE + 1, resultRobot.getX());
        assertEquals(Y_VALUE, resultRobot.getY());
        assertEquals('N', resultRobot.getDirection());
    }

    @Test
    public void shouldGetNewResultWhenNorthGetCommand_LMLMLMLMM() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'N');

        Robot resultRobot = robot.getCommand("LMLMLMLMM");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE + 1, resultRobot.getY());
        assertEquals('N', resultRobot.getDirection());
    }

    @Test
    public void shouldGetNewResultWhenEastGetCommand_MMRMMRMRRM() {
        Robot robot = new Robot(3, 3, 'E');

        Robot resultRobot = robot.getCommand("MMRMMRMRRM");

        assertEquals(X_VALUE + 4, resultRobot.getX());
        assertEquals(Y_VALUE - 1, resultRobot.getY());
        assertEquals('E', resultRobot.getDirection());
    }

    @Test
    public void shouldRunNormalAndGetRightResultWhenTwoRobotsGetCommand() {
        Robot robot = new Robot(X_VALUE, Y_VALUE, 'N');

        Robot resultRobot = robot.getCommand("LMLMLMLMM");

        assertEquals(X_VALUE, resultRobot.getX());
        assertEquals(Y_VALUE + 1, resultRobot.getY());
        assertEquals('N', resultRobot.getDirection());

        Robot robot2 = new Robot(3, 3, 'E');

        Robot resultRobot2 = robot2.getCommand("MMRMMRMRRM");

        assertEquals(X_VALUE + 4, resultRobot2.getX());
        assertEquals(Y_VALUE - 1, resultRobot2.getY());
        assertEquals('E', resultRobot2.getDirection());
    }


}