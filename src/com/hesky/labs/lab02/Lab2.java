/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab02;

import java.util.Scanner;

/**
 * Task 1.2
 * Змініть текст наступним чином:в кожному реченні тексту видалити вказаний
 * символ
 * @author Andrew Boyarsky
 */
public class Lab2 {
    private static final String END_OF_SENTENCE_PATTERN = "\\.|\\;|\n\\!\\?";
    private static final String DEFAULT_DELIMITER = ".";
    private static final int DEFAULT_CHAR_POSITION = 0;

    public static void main(String[] args) {
        TextData textData = readTextData();
        String resultText = processTextData(textData);
        System.out.println(resultText);
    }

    private static String processTextData(TextData textData) {
        String[] sentences = splitSentences(textData.text);
        return deleteChar(sentences, textData.charToDelete);
    }

    private static String deleteChar(String string, char ch) {
        return string.replaceFirst(String.valueOf(ch), "");
    }
    private static String deleteChar(String[] strings, char ch) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            builder.append(deleteChar(strings[i], ch));
            builder.append(DEFAULT_DELIMITER);
        }
        return builder.toString();
    }

    private static String[] splitSentences(String text, String splitPattern) {
        return text.split(splitPattern);
    }
    private static String[] splitSentences(String text) {
        return splitSentences(text, END_OF_SENTENCE_PATTERN);
    }

    private static TextData readTextData() {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine();
            char charToReplace = readChar(scanner, DEFAULT_CHAR_POSITION);
            return new TextData(text, charToReplace);
        }
    }

    private static char readChar(Scanner scanner, int charPosition) {
        return scanner.nextLine().charAt(charPosition);
    }

    private static class TextData {
        private String text;
        private char charToDelete;

        public TextData(String text, char charToDelete) {
            this.text = text;
            this.charToDelete = charToDelete;
        }
    }
}
