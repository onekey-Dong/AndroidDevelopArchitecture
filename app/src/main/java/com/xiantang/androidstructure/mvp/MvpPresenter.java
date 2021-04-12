package com.xiantang.androidstructure.mvp;

import com.xiantang.androidstructure.base.BaseMvpPresenter;

public class MvpPresenter extends BaseMvpPresenter<MvpDemoActivity, MvpModel> implements IMvp.IPresenter {

    @Override
    public MvpModel createModel() {
        return new MvpModel();
    }

    @Override
    public void updateTextFromView(String content) {
        mModel.updateText(content);
    }

    @Override
    public void clearTextInView() {
        mModel.clearText();
    }

    @Override
    public void dataChangedFromModel(String content) {
        mView.showText(content);
    }

    @Override
    public void clearTextFromModel() {
        mView.clearText();
    }
}
