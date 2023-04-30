package ua.lviv.iot.algo.part1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PhoneNumberReverserTest {
    @Test
    public void testReversePhoneNumbersInText() {
        String text = "These are my numbers 0997199, 093-51-12, 01-23-45-6.";
        PhoneNumberReverser phoneNumberReverser = new PhoneNumberReverser(text);
        String expected = "These are my numbers 9917990, 21-15-390, 6-54-32-10.";
        String actual = phoneNumberReverser.reversePhoneNumbersInText();
        assertEquals(expected, actual);
    }
}
