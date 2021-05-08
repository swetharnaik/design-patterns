package com.software.design.patterns.factory;

public class ClothFactory {

    public Cloth serveCloth(String clothType, String color, String pattern) {
        switch(clothType.toUpperCase()) {
            case "COTTON": return new CottonCloth(1, 20, clothType, color, pattern);
            case "NYLON": return new NylonCloth(2, 15, clothType, color, pattern);
            default: throw new IllegalArgumentException(clothType + " either not a valid type or currently not manufacturing this material." +
                    "Please contact support for furthur assisstance.");
        }
    }
}
