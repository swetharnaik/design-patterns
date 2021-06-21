package com.software.design.patterns.abstractfactory;

public class RegularNylon implements Nylon {

    @Override
    public String getChemicals() {
        return "Acquire chemicals necessary for Nylon";
    }

    @Override
    public String toWeave() {
        return "Mechanism to weave a nylon cloth";
    }

    @Override
    public String toString() {
        return "Producing RegularNylon...";
    }
}
