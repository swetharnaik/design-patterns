package com.software.design.patterns.singleton;

public class AppLogger {

    private static AppLogger app;

    private AppLogger() {
    }

    //Lazy Instantiation
    public AppLogger getAppLogger() {
        //Not thread safe
        //During multithreading, there can be a chances of more than 1 thread
        //accessing this method and creating 2 new object instances simultaneously.
        if(app==null)
            app=new AppLogger();
        return app;
    }
}
