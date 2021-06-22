package com.software.design.patterns.prototype;

public class SyntheticCloth extends Cloth {

    public SyntheticCloth(int id, String type) {
        super(id, type);
    }

    //ToWeave method with a specific implementation for weaving cotton cloth
    public String toWeave() {
        return "Mechanism to weave a synthetic cloth";
    }

}
