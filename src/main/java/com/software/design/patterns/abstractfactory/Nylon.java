package com.software.design.patterns.factory;

public class NylonCloth extends Cloth {

    public NylonCloth(int id, int rate, String type, String color, String pattern) {
        super(id, rate, type, color, pattern);
    }

    //ToWeave method with a specific implementation for weaving nylon cloth
    public String toWeave() {
        return "Mechanism to weave a nylon cloth";
    }


}
