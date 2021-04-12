package com.xiantang.androidstructure.base;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    protected final String TAG = this.getClass().getSimpleName();

    public void log(String content) {
        Log.i(TAG, content);
    }

    public void startAct(Class<? extends Activity> cls) {
        if (cls == null) {
            return;
        }
        startActivity(new Intent(this, cls));
    }
}
