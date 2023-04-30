package ua.lviv.iot.algo.part1.model;

import ua.lviv.iot.algo.part1.reader.Reader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberReverser {
    public static final Pattern PHONE_FORMATS = Pattern.compile("(\\d{3}-\\d{2}-\\d{2})|(\\d{7})|(\\d{2}-\\d{2}-\\d{2}-\\d)");

    private final String text;

    public PhoneNumberReverser(final String text) {
        this.text = text;
    }

    public final String reversePhoneNumbersInText() {
        Matcher matcher = PHONE_FORMATS.matcher(text);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String phoneNumber = matcher.group();
            StringBuilder reversedPhoneNumber = new StringBuilder(phoneNumber).reverse();
            matcher.appendReplacement(sb, reversedPhoneNumber.toString());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        Reader reader = new Reader();
        String text = reader.readText();
        PhoneNumberReverser reverser = new PhoneNumberReverser(text);
        String reversedText = reverser.reversePhoneNumbersInText();
        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + reversedText);
    }
}
