package com.software.design.patterns.abstractfactory;

public class RegularUnit implements AbstractFactory {
    @Override
    public Cotton manufactureCotton() {
        return new RegularCotton();
    }

    @Override
    public Nylon manufactureNylon() {
        return new RegularNylon();
    }
}
