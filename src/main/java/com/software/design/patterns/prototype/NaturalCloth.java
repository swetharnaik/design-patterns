package com.software.design.patterns.prototype;

public class NaturalCloth extends Cloth {

    public NaturalCloth(int id, String type) {
        super(id, type);
    }

    //ToWeave method with a specific implementation for weaving nylon cloth
    public String toWeave() {
        return "Mechanism to weave a natural based cloth";
    }


}
