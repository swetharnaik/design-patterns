package com.software.design.patterns.abstractfactory;

public class RegularCotton implements Cotton {
    @Override
    public String getCotton() {
        return "Get Cotton from farmers";
    }

    @Override
    public String toWeave() {
        return "Mechanism to weave a cotton cloth";
    }

    @Override
    public String toString() {
        return "Producing RegularCotton...";
    }
}
