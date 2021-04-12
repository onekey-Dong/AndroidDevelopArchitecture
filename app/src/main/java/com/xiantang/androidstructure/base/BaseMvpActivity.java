package com.xiantang.androidstructure.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseMvpActivity<P extends IBaseMvp.IPresenter> extends BaseActivity implements IBaseMvp.IView<P> {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.setView(this);
            mPresenter.onAttachToView();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDetachFromView();
    }
}
