package test.java.Nasa.java.app;


import main.java.Nasa.java.app.Nasa;
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

}