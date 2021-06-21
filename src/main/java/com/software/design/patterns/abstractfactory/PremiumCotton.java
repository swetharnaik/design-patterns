package com.software.design.patterns.abstractfactory;

public class PremiumCotton implements Cotton {

    @Override
    public String getCotton() {
        return "Get Pure Cotton from certified farmers";
    }

    @Override
    public String toWeave() {
        return "Mechanism to weave fine Cotton cloth";
    }

    @Override
    public String toString() {
        return "Producing PremiumCotton...";
    }
}
