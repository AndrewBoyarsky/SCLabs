/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab04;

public class TechDocImpl implements TechDoc {
    private BuildingDescription description;

    public TechDocImpl(BuildingDescription description) {
        this.description = description;
    }

    @Override
    public BuildingDescription getBuildingDescription() {
        return description;
    }
}
