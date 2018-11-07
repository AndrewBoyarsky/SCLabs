/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab04;

public class BuildingDescription {
    private int floors;
    private int square;

    public BuildingDescription(int floors, int square) {
        this.floors = floors;
        this.square = square;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}
