package com.software.design.patterns.abstractfactory;

public class PremiumNylon implements Nylon {

    @Override
    public String getChemicals() {
        return "Acquire chemicals of a certain standard";
    }

    @Override
    public String toWeave() {
        return "Mechanism to weave premium Nylon cloth";
    }

    @Override
    public String toString() {
        return "Producing PremiumNylon...";
    }
}
