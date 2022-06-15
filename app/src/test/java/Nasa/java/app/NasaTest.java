package test.java.Nasa.java.app;



import main.java.Nasa.java.app.Nasa;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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
    public void buildMap(){
        int x=5;
        int y=5;
        assertEquals(5,nasa.getMap(x,y).get(0));
        assertEquals(5,nasa.getMap(x,y).get(1));

    }

    @Test
    public void turnRightInDirectionN(){
        char actionR='R';
        char directionN='N';
        assertEquals(nasa.turnAround(directionN,actionR),'E');


    }
    @Test
    public void turnRightInDirectionE(){
        char actionR='R';
        char directionE='E';
        assertEquals(nasa.turnAround(directionE,actionR),'S');



    }
    @Test
    public void turnRightInDirectionS(){
        char actionR='R';
        char directionS='S';
        assertEquals(nasa.turnAround(directionS,actionR),'W');



    }
    @Test
    public void turnRightInDirectionW(){
        char actionR='R';
        char directionW='W';
        assertEquals(nasa.turnAround(directionW,actionR),'N');


    }
    @Test
    public void ContinuousTurnRight(){
        char actionR='R';
        char directionN='N';
        char newDirection = nasa.turnAround(directionN, actionR);
        assertEquals(nasa.turnAround(newDirection,actionR),'S');


    }
    @Test
    public void turnLeftInDirectionN() {
        char actionL = 'L';
        char directionN = 'N';
        assertEquals(nasa.turnAround(directionN,actionL),'W');
    }
    @Test
    public void turnLeftInDirectionE() {
        char actionL = 'L';
        char directionE = 'E';
        assertEquals(nasa.turnAround(directionE,actionL),'N');
    }
    @Test
    public void turnLeftInDirectionS() {
        char actionL = 'L';
        char directionS = 'S';
        assertEquals(nasa.turnAround(directionS,actionL),'E');
    }
    @Test
    public void turnLeftInDirectionW() {
        char actionL = 'L';
        char directionW = 'W';
        assertEquals(nasa.turnAround(directionW,actionL),'S');
    }
    @Test
    public void ContinuousTurnLeft(){
        char actionL='L';
        char directionN='N';
        char newDirection = nasa.turnAround(directionN, actionL);
        assertEquals(nasa.turnAround(newDirection,actionL),'S');


    }
    @Test
    public void ContinuousTurnLeftThenRight(){
        char actionL='L';
        char actionR='R';
        char directionN='N';
        char newDirection = nasa.turnAround(directionN, actionL);
        assertEquals(nasa.turnAround(newDirection,actionR),'N');


    }
    @Test
    public void GoOneDistanceForwardWhenMeetM(){
        char direction='N';
        List<Integer> location = List.of(1, 2);
        List<Integer> walk = nasa.walk(direction, location);
        assertEquals(1,walk.get(0));
        assertEquals(3,walk.get(1));
    }
}