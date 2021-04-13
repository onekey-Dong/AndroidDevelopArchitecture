package com.xiantang.androidstructure.base.mvp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

public abstract class BaseMvpFragment<P extends IBaseMvp.IPresenter> extends Fragment implements IBaseMvp.IView<P> {

    protected P mPresenter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter = createPresenter();
    }

    @Override
    public void onDestroyView() {
        if (mPresenter != null) {
            mPresenter.onDetachFromView();
        }
        mPresenter = null;
        super.onDestroyView();
    }
}
