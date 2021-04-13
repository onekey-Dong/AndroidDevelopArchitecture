package com.xiantang.androidstructure.demo.mvc;

public class MvcController implements IMvc.IController {

    private IMvc.IModel iModel;

    public MvcController(IMvc.IModel iModel) {
        this.iModel = iModel;
    }

    @Override
    public void updateTheTextFromView(String content) {
        iModel.updateTheText(content);
    }

    @Override
    public void clearText() {
        iModel.clearText();
    }
}
