package qlearn.qualcomm.com.roboguicetest;

import android.app.Application;

import com.google.inject.Binder;
import com.google.inject.Module;

public class DiModule implements Module {
    private Application application;

    public DiModule(Application app) {
        application = app;
    }

    @Override
    public void configure(Binder binder) {
        binder.bind(Pojo.class).toInstance(new Pojo(application.getApplicationContext()));
    }
}
