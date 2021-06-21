package com.software.design.patterns.abstractfactory;


public class Vendor {

    public static void main(String[] args) {
        AbstractFactory premiumUnit = new PremiumUnit();
        AbstractFactory regularUnit = new RegularUnit();
        System.out.println("Vendor ABC wants Regular Nylon: " + regularUnit.manufactureNylon());
        System.out.println("Vendor XYZ wants all the premium clothes: \n" +
                premiumUnit.manufactureCotton() + "\n" + premiumUnit.manufactureNylon());
    }
}
