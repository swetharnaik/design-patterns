package com.software.design.patterns.prototype;

import java.util.HashMap;

//Registry to maintain preconfigured commonly used objects in the application
public class ClothRegistry {

    //Maintain a hash map store to save the predefined objects
    //Key will contain the data client will pass as the criteria for which object cloning
    private static HashMap<String, Cloth> clothStore = new HashMap<>();

    static {
        clothStore.put("Nylon", new SyntheticCloth(123, "Nylon"));
        clothStore.put("Cotton", new NaturalCloth(54, "Cotton"));
        clothStore.put("Rayon", new SyntheticCloth(93, "Rayon"));
        clothStore.put("Linen", new NaturalCloth(84, "Linen"));
        clothStore.put("Jute", new NaturalCloth(67, "Jute"));
    }

    //return the required object with respect to the type variable
    Cloth getCloth(String type) {
        return (Cloth) clothStore.get(type).clone();
    }
}
