/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab04;

import java.util.Random;

public class Customer extends Person {
    public Customer(String name) {
        super(name);
    }

    public TechDoc createTechDoc() {
        Random random = new Random();
        return new TechDocImpl(new BuildingDescription(random.nextInt(100)+1, random.nextInt(90) + 1));
    }
}
