/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.car;

public class Person {
    private Role role;

    public Person(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
