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

   /* @Test
    public void GoOneDistanceForwardWhenMeetM(){
        char direction='N';
        List<Integer> location = List.of(1, 2);
        List.of(5,5);
char actionL='L';
assertEquals(nasa.turnAround(directionW,actionL),'S');
assertEquals(nasa.turnAround(directionS,actionL),'E');
assertEquals(nasa.turnAround(directionE,actionL),'N');
assertEquals(nasa.turnAround(directionN,actionL),'W');
        assertEquals(Nasa.turnAround(direction,action),'E');
        char difAction='L';
        assertEquals(Nasa.turnAround(direction,difAction),'W');
    }*/
}