package ua.lviv.iot.algo.part1.reader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class ReaderTest {
    @Test
    public void testReadText() {
        ByteArrayInputStream in = new ByteArrayInputStream("Hello, that is my phone number 123-45-67.".getBytes());
        System.setIn(in);
        Reader reader = new Reader();
        String text = reader.readText();
        assertEquals("Hello, that is my phone number 123-45-67.", text);
        System.setIn(System.in);
    }
}