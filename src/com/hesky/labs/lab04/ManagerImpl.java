/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab04;

public class ManagerImpl extends Person implements Manager {

    public ManagerImpl(String name) {
        super(name);
    }


    @Override
    public void registerTechDoc(TechDoc techDoc) {
        System.out.println("Register" + techDoc.toString());
    }
}
