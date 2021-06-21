package com.software.design.patterns.abstractfactory;

public class PremiumUnit implements AbstractFactory {

    @Override
    public Cotton manufactureCotton() {
        return new PremiumCotton();
    }

    @Override
    public Nylon manufactureNylon() {
        return new PremiumNylon();
    }
}
