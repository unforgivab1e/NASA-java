package test.java.Nasa.java.app;



import main.java.Nasa.java.app.Nasa;
import main.resources.ResultDto;
import main.resources.Robot;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static main.resources.Fuction.*;
import static org.junit.jupiter.api.Assertions.*;

class NasaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    Nasa nasa=new Nasa();
    @Test
    public void buildMap() {
        int x = 5;
        int y = 5;
        assertEquals(5, getMap(x, y).get(0));
        assertEquals(5, getMap(x, y).get(1));

    }

    @Test
    public void turnRightInDirectionN(){
        char actionR='R';
        char directionN='N';
        assertEquals(turnAround(directionN, actionR), 'E');


    }
    @Test
    public void turnRightInDirectionE(){
        char actionR='R';
        char directionE='E';
        assertEquals(turnAround(directionE, actionR), 'S');



    }
    @Test
    public void turnRightInDirectionS(){
        char actionR='R';
        char directionS='S';
        assertEquals(turnAround(directionS, actionR), 'W');



    }
    @Test
    public void turnRightInDirectionW(){
        char actionR='R';
        char directionW='W';
        assertEquals(turnAround(directionW, actionR), 'N');


    }
    @Test
    public void ContinuousTurnRight() {
        char actionR = 'R';
        char directionN = 'N';
        char newDirection = turnAround(directionN, actionR);
        assertEquals(turnAround(newDirection, actionR), 'S');


    }
    @Test
    public void turnLeftInDirectionN() {
        char actionL = 'L';
        char directionN = 'N';
        assertEquals(turnAround(directionN, actionL), 'W');
    }
    @Test
    public void turnLeftInDirectionE() {
        char actionL = 'L';
        char directionE = 'E';
        assertEquals(turnAround(directionE, actionL), 'N');
    }
    @Test
    public void turnLeftInDirectionS() {
        char actionL = 'L';
        char directionS = 'S';
        assertEquals(turnAround(directionS, actionL), 'E');
    }
    @Test
    public void turnLeftInDirectionW() {
        char actionL = 'L';
        char directionW = 'W';
        assertEquals(turnAround(directionW, actionL), 'S');
    }
    @Test
    public void ContinuousTurnLeft() {
        char actionL = 'L';
        char directionN = 'N';
        char newDirection = turnAround(directionN, actionL);
        assertEquals(turnAround(newDirection, actionL), 'S');


    }
    @Test
    public void ContinuousTurnLeftThenRight() {
        char actionL = 'L';
        char actionR = 'R';
        char directionN = 'N';
        char newDirection = turnAround(directionN, actionL);
        assertEquals(turnAround(newDirection, actionR), 'N');


    }
    @Test
    public void GoOneDistanceForwardWhenMeetM() {
        char direction = 'N';
        List<Integer> location = List.of(1, 2);
        List<Integer> walk = walk(direction, location);
        assertEquals(1, walk.get(0));
        assertEquals(3, walk.get(1));

        /*Robot(1,2,"E").walk("L")
        Robot(1,2,"E").walk("LLM")*/
    }

    @Test
    public void mixedOperationOfMultipleInstructions() {
        char directionN = 'N';
        List<Integer> location = List.of(1, 2);
        ResultDto result = new Robot(location, directionN).getCommand("RM");
        assertEquals(2, result.getX());
        assertEquals(2, result.getY());
        assertEquals('E', result.getDirection());
    }

    @Test
    public void checkMultiplerRsult1() {
        char direction = 'N';
        List<Integer> location = List.of(1, 2);
        ResultDto result = new Robot(location, direction).getCommand("LMLMLMLMM");
        assertEquals(1, result.getX());
        assertEquals(3, result.getY());
        assertEquals('N', result.getDirection());
    }

    @Test
    public void checkMultiplerRsult2() {
        char direction = 'E';
        List<Integer> location = List.of(3, 3);
        ResultDto result = new Robot(location, direction).getCommand("MMRMMRMRRM");
        assertEquals(5, result.getX());
        assertEquals(1, result.getY());
        assertEquals('E', result.getDirection());
    }
    @Test
    public void HandleMultipleRobotCases() {
        char direction1 = 'N';
        List<Integer> location1 = List.of(1, 2);
        char direction2 = 'E';
        List<Integer> location2 = List.of(3, 3);
        ResultDto result1 = new Robot(location1, direction1).getCommand("LMLMLMLMM");
        ResultDto result2 = new Robot(location2, direction2).getCommand("MMRMMRMRRM");
        assertEquals(1, result1.getX());
        assertEquals(3, result1.getY());
        assertEquals('N', result1.getDirection());
        assertEquals(5, result2.getX());
        assertEquals(1, result2.getY());
        assertEquals('E', result2.getDirection());
    }

}