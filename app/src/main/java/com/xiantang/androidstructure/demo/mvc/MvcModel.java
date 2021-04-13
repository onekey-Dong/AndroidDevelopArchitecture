package com.xiantang.androidstructure.demo.mvc;

import android.os.Handler;
import android.os.Looper;

public class MvcModel implements IMvc.IModel {

    private IMvc.IView iView;

    private Handler mDelayHandler = new Handler(Looper.getMainLooper());

    public MvcModel(IMvc.IView iView) {
        this.iView = iView;
    }

    @Override
    public void updateTheText(final String content) {
        mDelayHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iView.showText(content);
            }
        }, 500);
    }

    @Override
    public void clearText() {
        iView.clearText();
    }
}
