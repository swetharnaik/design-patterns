package com.software.design.patterns.builder;

//Create, Construct and Return Representations ordered by Client
public class Director {

    ClothBuilder clothBuilder;

//    public Director(ClothBuilder clothBuilder) {
//        this.clothBuilder=clothBuilder;
//    }

    public void constructCloth(ClothBuilder clothBuilder) {
        this.clothBuilder = clothBuilder;
        clothBuilder.buildTypeName();
        clothBuilder.buildRate();
        clothBuilder.buildColor();
        clothBuilder.buildPattern();
        clothBuilder.buildChemicals();
        clothBuilder.buildRawMaterials();
        clothBuilder.buildMachine();
    }

    public Cloth returnCloth() {
        return clothBuilder.returnCloth();
    }

}
