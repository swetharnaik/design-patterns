package com.software.design.patterns.builder;

public class PureSilk implements ClothBuilder {

    private Cloth cloth;

    public PureSilk() {
        cloth=new Cloth();
    }

    @Override
    public Cloth returnCloth() {
        return cloth;
    }

    @Override
    public void buildTypeName() {
        cloth.setTypeName("PureSilk");
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
        cloth.setChemicals("Get Chemicals for Silk Cloth");
    }

    @Override
    public void buildRawMaterials() {
        cloth.setRawMaterials("Get Raw Materials for Silk Cloth");
    }

    @Override
    public void buildMachine() {
        cloth.setMachine("Get Machine for Silk Cloth");
    }
}
