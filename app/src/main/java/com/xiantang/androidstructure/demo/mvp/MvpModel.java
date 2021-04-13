package com.xiantang.androidstructure.demo.mvp;

import com.xiantang.androidstructure.base.mvp.BaseMvpModel;

public class MvpModel extends BaseMvpModel<MvpPresenter> implements IMvp.IModel {

    @Override
    public void updateText(String content) {
        mPresenter.dataChangedFromModel(content);
    }

    @Override
    public void clearText() {
        mPresenter.clearTextFromModel();
    }
}
