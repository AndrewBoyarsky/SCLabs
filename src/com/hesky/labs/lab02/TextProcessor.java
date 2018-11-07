/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab02;

public class TextProcessor {
    private static final String END_OF_SENTENCE_PATTERN = "\\.|\\;|\n\\!\\?";
    private static final String DEFAULT_DELIMITER = ".";

    private Reader reader;

    public TextProcessor(Reader reader) {
        this.reader = reader;
    }

    public TextProcessor() {

    }

    public String processTextData(TextData textData) {
        String[] sentences = splitSentences(textData.getText());
        return deleteChar(sentences, textData.getCharToDelete());
    }

    public String processTextData() {
        return processTextData(reader.read());
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

    public void shutdown() {
        if (reader != null) {
            reader.close();
        }
    }
}
