package com.software.design.patterns.builder;

public class Nylon implements ClothBuilder {

    private Cloth cloth;

    public Nylon() {
        cloth=new Cloth();
    }

    @Override
    public Cloth returnCloth() {
        return cloth;
    }

    @Override
    public void buildTypeName() {
        cloth.setType("Nylon");
    }

    @Override
    public void buildRate() {
        cloth.setRate(100);
    }

    @Override
    public void buildColor() {
    }

    @Override
    public void buildPattern() {
    }

    @Override
    public void buildChemicals() {
        cloth.setChemicals("Get Chemicals for Nylon Cloth");
    }

    @Override
    public void buildRawMaterials() {
        cloth.setRawMaterials("Get Raw Materials for Nylon Cloth");
    }

    @Override
    public void buildMachine() {
        cloth.setMachine("Get Machine for Nylon Cloth");
    }
}
