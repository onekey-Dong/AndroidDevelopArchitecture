package com.xiantang.androidstructure.base;

public interface IBaseMvp {

    interface IPresenter<V extends IView, M extends IModel> {

        void setView(V view);

        void setModel(M model);

        M createModel();

        void onAttachToView();

        void onDetachFromView();
    }

    interface IModel<P extends IPresenter> {

        void setPresenter(P presenter);

        void initModel();

        void releaseRes();
    }

    interface IView<P extends IPresenter> {

        P createPresenter();
    }
}
