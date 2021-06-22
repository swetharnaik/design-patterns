package com.software.design.patterns.prototype;


public class Vendor {

    public static void main(String[] args) {

        ClothRegistry clothRegistry = new ClothRegistry();
        Cloth order1 = clothRegistry.getCloth("Cotton");
        System.out.println(order1);
        System.out.println(order1.toWeave());
        Cloth order2 = clothRegistry.getCloth("Rayon");
        System.out.println(order2);
        System.out.println(order2.toWeave());
    }
}
