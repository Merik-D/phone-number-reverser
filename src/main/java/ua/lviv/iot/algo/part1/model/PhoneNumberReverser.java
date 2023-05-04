package ua.lviv.iot.algo.part1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberReverser {
    public static final Pattern PHONE_FORMATS_PATTERN = Pattern.compile(
            "(\\d{3}-\\d{2}-\\d{2})|(\\d{7})|(\\d{2}-\\d{2}-\\d{2}-\\d)"
    );

    private final String text;

    public PhoneNumberReverser(final String text) {
        this.text = text;
    }

    public final String reversePhoneNumbersInText() {
        Matcher matcher = PHONE_FORMATS_PATTERN.matcher(text);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            String phoneNumber = matcher.group();
            matcher.appendReplacement(sb, new StringBuilder(phoneNumber).reverse().toString());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
