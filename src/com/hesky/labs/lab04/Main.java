/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab04;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Bob");
        TechDoc techDoc = customer.createTechDoc();
        Manager manager = new ManagerImpl("Vasya");
        manager.registerTechDoc(techDoc);
        Designer designer = new DesignerImpl("Petya");
        System.out.println(designer.calculatePrice(techDoc));
        DesignerCrewImpl designerCrew = designer.gatherTeam(techDoc);
        System.out.println(designerCrew.getDesigners());
        Building building = designerCrew.build();
    }
}
