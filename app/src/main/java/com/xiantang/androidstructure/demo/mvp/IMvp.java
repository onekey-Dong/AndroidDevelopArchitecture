package com.xiantang.androidstructure.demo.mvp;

public interface IMvp {

    interface IView {

        void showText(String text);

        void clearText();
    }

    interface IPresenter {

        void updateTextFromView(String content);

        void clearTextInView();

        void dataChangedFromModel(String content);

        void clearTextFromModel();
    }

    interface IModel {

        void updateText(String content);

        void clearText();
    }
}
