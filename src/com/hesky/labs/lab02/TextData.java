/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab02;

public class TextData {
    private String text;
    private char charToDelete;

    public TextData(String text, char charToDelete) {
        this.text = text;
        this.charToDelete = charToDelete;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public char getCharToDelete() {
        return charToDelete;
    }

    public void setCharToDelete(char charToDelete) {
        this.charToDelete = charToDelete;
    }
}
