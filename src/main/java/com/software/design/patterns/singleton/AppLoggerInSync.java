package com.software.design.patterns.singleton;

public class AppLoggerInSync {

    private static AppLoggerInSync app;

    private AppLoggerInSync() {
    }

    //Lazy Instantiation
    //Thread safe as only one thread allowed at a time due to synchronized method
    public synchronized AppLoggerInSync getAppLogger() {
        if(app==null)
            app=new AppLoggerInSync();
        return app;
    }
}
