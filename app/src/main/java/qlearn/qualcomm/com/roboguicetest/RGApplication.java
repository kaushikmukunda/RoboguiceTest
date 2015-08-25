package qlearn.qualcomm.com.roboguicetest;

import android.app.Application;

import roboguice.RoboGuice;
import roboguice.inject.RoboInjector;

public class RGApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RoboGuice.getOrCreateBaseApplicationInjector(this, RoboGuice.DEFAULT_STAGE, RoboGuice.newDefaultRoboModule(this));
//        RoboInjector injector = RoboGuice.getInjector(this);
  //      injector.injectMembers(this);
    }
}
