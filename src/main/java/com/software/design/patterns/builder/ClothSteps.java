package com.software.design.patterns.builder;

//Process methods followed by all types/subclasses/representations
public abstract class ClothSteps {

    public abstract void setType(String type);

    public abstract void setRate(int rate);

    public abstract void setColor(String color);

    public abstract void setPattern(String pattern);

    public abstract void setChemicals(String chemicals);

    public abstract void setRawMaterials(String rawMaterials);

    public abstract void setMachine(String machine);

}
