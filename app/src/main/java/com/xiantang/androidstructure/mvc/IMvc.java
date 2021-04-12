package com.xiantang.androidstructure.mvc;

public interface IMvc {

    interface IView{

        void showText(String text);

        void clearText();
    }

    interface IModel {

        void updateTheText(String content);

        void clearText();

    }

    interface IController {

        void updateTheTextFromView(String content);

        void clearText();

    }
}
