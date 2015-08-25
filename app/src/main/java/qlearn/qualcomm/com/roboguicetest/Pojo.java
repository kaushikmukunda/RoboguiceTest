package qlearn.qualcomm.com.roboguicetest;

import android.content.Context;

import com.google.inject.Inject;

public class Pojo {
    private Context context;

    @Inject
    public Pojo(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }
}
