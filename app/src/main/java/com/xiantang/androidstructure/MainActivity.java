package com.xiantang.androidstructure;

import android.os.Bundle;
import android.view.View;

import com.xiantang.androidstructure.base.BaseActivity;
import com.xiantang.androidstructure.demo.mvc.MvcDemoActivity;
import com.xiantang.androidstructure.demo.mvp.MvpDemoActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        switch (view.getId()) {
            case R.id.btnToMvc:
                startAct(MvcDemoActivity.class);
                break;
            case R.id.btnToMvp:
                startAct(MvpDemoActivity.class);
                break;
        }
    }
}
