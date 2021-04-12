package com.xiantang.androidstructure.base;

public abstract class BaseMvpPresenter<V extends IBaseMvp.IView, M extends IBaseMvp.IModel> implements IBaseMvp.IPresenter<V , M> {

    protected V mView;
    protected M mModel;

    @Override
    public void setView(V view) {
        this.mView = view;
        this.mModel = createModel();
        if (mModel != null) {
            mModel.setPresenter(this);
        }
    }

    @Override
    public void setModel(M model) {
        this.mModel = model;
    }

    @Override
    public void onAttachToView() {
        if (mModel != null) {
            mModel.initModel();
        }
    }

    @Override
    public void onDetachFromView() {
        if (mModel != null) {
            mModel.releaseRes();
        }
    }
}
