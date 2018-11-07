/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab04;

import java.util.ArrayList;
import java.util.List;

public class DesignerCrewImpl {
    private List<Designer> designers = new ArrayList<>();
    public DesignerCrewImpl(int size) {
        for (int i = 0; i < size; i++) {
            designers.add(new DesignerImpl("Designer" + 1));
        }
    }

    public List<Designer> getDesigners() {
        return designers;
    }

    public Building build() {
        return new Building();
    }
}
