/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab04;

public class DesignerImpl extends Person implements Designer {
    public DesignerImpl(String name) {
        super(name);
    }

    @Override
    public double calculatePrice(TechDoc techDoc) {
        return techDoc.getBuildingDescription().getFloors() * techDoc.getBuildingDescription().getSquare();
    }

    @Override
    public DesignerCrewImpl gatherTeam(TechDoc techDoc) {
        return new DesignerCrewImpl((int) (calculatePrice(techDoc) / 10));
    }
}
