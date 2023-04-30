package ua.lviv.iot.algo.part1.reader;

import java.util.Scanner;

public class Reader {
    public String readText() {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            System.out.print("Enter your text: ");
            return scanner.nextLine();
        }
    }
}
