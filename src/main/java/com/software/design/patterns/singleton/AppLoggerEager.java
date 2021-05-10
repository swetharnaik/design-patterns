package com.software.design.patterns.singleton;

public class AppLoggerEager {

    private static AppLoggerEager app = new AppLoggerEager();

    private AppLoggerEager() {
    }

    //Eager Instantiation
    //No need to worry about thread safety as object is already loaded during app start up
    public AppLoggerEager getAppLogger() {
        return app;
    }
}
