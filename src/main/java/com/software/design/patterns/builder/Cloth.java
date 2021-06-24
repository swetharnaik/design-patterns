package com.software.design.patterns.builder;

//Base Class with params but no constructors
public class Cloth extends ClothSteps {

    private String type;
    private int rate;
    private String color;
    private String pattern;
    private String chemicals;
    private String rawMaterials;
    private String machine;

    @Override
    public void setTypeName(String type) {
        this.type=type;
    }

    @Override
    public void setRate(int rate) {
        this.rate=rate;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setPattern(String pattern) {
        this.pattern=pattern;
    }

    @Override
    public void setChemicals(String chemicals) {
        this.chemicals=chemicals;
    }

    @Override
    public void setRawMaterials(String rawMaterials) {
        this.rawMaterials=rawMaterials;
    }

    @Override
    public void setMachine(String machine) {
        this.machine=machine;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "type='" + type + '\'' +
                ", rate=" + rate +
                ", color='" + color + '\'' +
                ", pattern='" + pattern + '\'' +
                ", chemicals='" + chemicals + '\'' +
                ", rawMaterials='" + rawMaterials + '\'' +
                ", machine='" + machine + '\'' +
                '}';
    }
}
