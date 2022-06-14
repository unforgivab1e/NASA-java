package test.java.Nasa.java.app;



import main.java.Nasa.java.app.Nasa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NasaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void RotateAndActOnCommand(){
        char direction='N';
        char action='R';
        assertEquals(Nasa.turnAround(direction,action),'E');
        char difAction='L';
        assertEquals(Nasa.turnAround(direction,difAction),'W');
    }
}