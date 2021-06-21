package com.software.design.patterns.factory;

public class Vendor {

    public static void main(String[] args) {
        ClothFactory clothFactory = new ClothFactory();
        Cloth clothOrder1 = clothFactory.serveCloth("Cotton", "Red", "TieAndDye");
        Cloth clothOrder2 = clothFactory.serveCloth("Nylon", "Blue", "Plain");
        System.out.println(clothOrder1.toWeave() + " " + clothOrder1.toString());
        System.out.println(clothOrder2.toWeave() + " " + clothOrder2.toString());

        Cloth clothOrder3 = clothFactory.serveCloth("Abc", "Blue", "Plain");
        System.out.println(clothOrder3.toWeave() + clothOrder3.toString());
    }
}
