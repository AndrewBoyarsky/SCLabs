/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab04;

public interface Designer {
    double calculatePrice(TechDoc techDoc);

    DesignerCrewImpl gatherTeam(TechDoc techDoc);
}
