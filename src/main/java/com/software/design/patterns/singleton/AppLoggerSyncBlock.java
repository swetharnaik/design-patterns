package com.software.design.patterns.singleton;

public class AppLoggerSyncBlock {

    private static AppLoggerSyncBlock app;

    private AppLoggerSyncBlock() {
    }

    //Lazy Instantiation
    //Synchronized method not necessary everytime (Required only during object creation)
    public AppLoggerSyncBlock getAppLogger() {
        if(app==null)
            //Thread safe as only one thread allowed at a time to access this synchronized block
            synchronized (AppLoggerSyncBlock.class) {
            if(app==null)
                app = new AppLoggerSyncBlock();
            }
        return app;
    }
}
