package com.xiantang.androidstructure.base;

public class BaseMvpModel<P extends IBaseMvp.IPresenter> implements IBaseMvp.IModel<P> {

    protected P mPresenter;

    @Override
    public void setPresenter(P presenter) {
        mPresenter = presenter;
    }

    @Override
    public void initModel() {

    }

    @Override
    public void releaseRes() {
        mPresenter = null;
    }
}
