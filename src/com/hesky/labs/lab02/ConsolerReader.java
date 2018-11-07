/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab02;

import java.util.Scanner;

public class ConsolerReader implements Reader, AutoCloseable {
    private static final int DEFAULT_CHAR_POSITION = 0;
    private Scanner scanner;

    public ConsolerReader() {
        this.scanner = new Scanner(System.in);
    }


    @Override
    public TextData read() {
        String text = scanner.nextLine();
        char charToReplace = readChar(scanner, DEFAULT_CHAR_POSITION);
        return new TextData(text, charToReplace);
    }

    private static char readChar(Scanner scanner, int charPosition) {
        return scanner.nextLine().charAt(charPosition);
    }

    @Override
    public void close() {
        scanner.close();
    }
}
