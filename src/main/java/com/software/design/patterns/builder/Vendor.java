package com.software.design.patterns.builder;

public class Vendor {

    public static void main(String[] args) {
        //Create the appropriate Builder Class
        ClothBuilder silkOrder = new PureSilk();
        //Create one director who will look after managing all the constructions of subtypes
        Director director1 = new Director();
        //Call construct method to set all the required params
        director1.constructCloth(silkOrder);
        //Return the representation object created
        Cloth silk = director1.returnCloth();
        System.out.println(silk);

        ClothBuilder juteOrder = new Jute();
        //Director director2 = new Director();
        director1.constructCloth(juteOrder);
        Cloth jute = director1.returnCloth();
        System.out.println(jute);
    }
}
