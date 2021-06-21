package com.software.design.patterns.factory;

public class CottonCloth extends Cloth {

    public CottonCloth(int id, int rate, String type, String color, String pattern) {
        super(id, rate, type, color, pattern);
    }

    //ToWeave method with a specific implementation for weaving cotton cloth
    public String toWeave() {
        return "Mechanism to weave a cotton cloth";
    }

}
