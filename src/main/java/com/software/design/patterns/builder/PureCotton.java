package com.software.design.patterns.builder;

public class PureCotton implements ClothBuilder {

    private Cloth cloth;

    public PureCotton() {
        cloth=new Cloth();
    }

    @Override
    public Cloth returnCloth() {
        return cloth;
    }

    @Override
    public void buildTypeName() {
        cloth.setTypeName("PureCotton");
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
        cloth.setChemicals("Get Chemicals for Cotton Cloth");
    }

    @Override
    public void buildRawMaterials() {
        cloth.setRawMaterials("Get Raw Materials for Cotton Cloth");
    }

    @Override
    public void buildMachine() {
        cloth.setMachine("Get Machine for Cotton Cloth");
    }
}
