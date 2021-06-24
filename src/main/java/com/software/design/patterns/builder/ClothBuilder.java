package com.software.design.patterns.builder;

//Build Methods followed by most classes
public interface ClothBuilder {

    void buildTypeName();
    void buildRate();
    void buildColor();
    void buildPattern();
    void buildChemicals();
    void buildRawMaterials();
    void buildMachine();
    Cloth returnCloth();
}
